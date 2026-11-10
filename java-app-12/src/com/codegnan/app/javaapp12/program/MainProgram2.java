package com.codegnan.app.javaapp12.program;

import com.codegnan.app.javaapp12.thread.ThreadA;
import com.codegnan.app.javaapp12.thread.ThreadB;
import com.codegnan.app.javaapp12.thread.ThreadC;

import static java.lang.System.out;

public class MainProgram2 {
    public static void main(String[] args) {
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();
        out.println(threadName+" thread startted");
        var threadA = new ThreadA();
        threadA.start();
        out.println(threadA.getName()+" started..");
        var threadB = new ThreadB();
        threadB.start();
        out.println(threadB.getName()+"Started..");
        var threadC = new ThreadC();
        threadC.start();
        out.println(threadC.getName()+" started");

        try{
            threadA.join();
            threadB.join();
//            threadC.join();
        }catch (InterruptedException interruptedException){
            interruptedException.printStackTrace();
        }
        out.println(threadName+" thread ended...");

    }
}
