package com.codegnan.app.javaapp09.thread;

import com.codegnan.app.javaapp09.mathematics.Addition;

import static java.lang.System.out;

public class AdditionThread extends Thread{
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

   /* @Override
    public void run(){
        var addition = new Addition();
        long addResult = addition.add(10,2);
        out.println(addResult);
    }*/
}
