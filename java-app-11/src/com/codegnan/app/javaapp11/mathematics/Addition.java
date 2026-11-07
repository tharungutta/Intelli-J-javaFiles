package com.codegnan.app.javaapp11.mathematics;

import static java.lang.System.out;

public class Addition {
    public int add (int num1, int num2){
        Thread thread = Thread.currentThread();
        String threadName = thread.getName();

        out.println(threadName+" started using add method");
        out.println(threadName+" thread's 1st value = "+ num1);
        out.println(threadName+" thread's 2nd value = "+num2);

        try{
            Thread.sleep(3000);
        } catch (InterruptedException interruptedException) {

        }

        int result = num1+num2;
        out.println(threadName+" thread's result value ="+ result);
        out.println(threadName+" thread ended using add method");

        return result;
    }
}
