package com.codegnan.app.javaapp12.thread;

import java.time.LocalTime;

import static java.lang.System.out;

public class TimeThread extends Thread{
    public TimeThread(){
        setDaemon(true);
    }
    @Override
    public void run(){
        try{
            for(; ; ){
                LocalTime localTime = LocalTime.now();
                int hr = localTime.getHour();
                int min = localTime.getMinute();
                int sec = localTime.getSecond();
                String currentTime = hr+":"+min+":"+sec;
                out.println(currentTime);
                Thread.sleep(1000);
            }
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
    }
}
