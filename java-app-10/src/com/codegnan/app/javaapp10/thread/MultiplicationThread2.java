package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Multiplication;

import static java.lang.System.out;

public class MultiplicationThread2 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            var multiplication = new Multiplication();
            long miltiplyResult = multiplication.multiply(10,2);
            out.println(miltiplyResult);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }
}
