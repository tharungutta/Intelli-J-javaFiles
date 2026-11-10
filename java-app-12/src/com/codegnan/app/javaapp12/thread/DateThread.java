package com.codegnan.app.javaapp12.thread;

import java.time.LocalDate;
import java.time.LocalTime;

import static java.lang.System.out;

public class DateThread extends Thread {
    public DateThread(){
        setDaemon(true);
    }
    public void run() {
        try {
            for (; ; ) {
                LocalDate localDate = LocalDate.now();
                int dd = localDate.getDayOfMonth();
                int mm = localDate.getMonthValue();
                int yyyy = localDate.getYear();
                String currentDate = dd + ":" + mm + ":" + yyyy;
                out.println(currentDate);
                Thread.sleep(1000);
            }
        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }
    }
}