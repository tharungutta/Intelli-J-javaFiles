package com.codegnan.app.javaapp12.program;

import com.codegnan.app.javaapp12.thread.DateThread;
import com.codegnan.app.javaapp12.thread.TimeThread;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        out.println("Thread Started.............");
        TimeThread timeThread = new TimeThread();
        timeThread.start();
        DateThread dateThread = new DateThread();
        dateThread.start();

        try{
            Thread.sleep(10000);
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();

        }
        out.println(threadName+" thread ended.....");


    }
}
