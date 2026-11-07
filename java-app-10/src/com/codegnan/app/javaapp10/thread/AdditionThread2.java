package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Addition;

import static java.lang.System.out;

public class AdditionThread2 implements Runnable{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            var addition = new Addition();
            long addResult = addition.add(10, 2);
            out.println(addResult);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }
}
