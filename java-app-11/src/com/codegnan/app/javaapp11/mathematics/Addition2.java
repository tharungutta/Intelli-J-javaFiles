package com.codegnan.app.javaapp11.mathematics;

import static java.lang.System.out;

public class Addition2 {
    private int num1;
    private int num2;

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    public int add (){
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
