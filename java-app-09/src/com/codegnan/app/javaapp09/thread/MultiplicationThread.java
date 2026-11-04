package com.codegnan.app.javaapp09.thread;

import com.codegnan.app.javaapp09.mathematics.Multiplication;
import com.codegnan.app.javaapp09.mathematics.Subtraction;

import static java.lang.System.out;

public class MultiplicationThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=10;i++) {
            var multiplication = new Multiplication();
            long miltiplyResult = multiplication.multiply(10,2);
            out.println(miltiplyResult);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException e){

            }
        }
    }

    /*@Override
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
    }*/

     /*@Override
   public void run(){
        var multiplication = new Multiplication();
        long miltiplyResult = multiplication.multiply(10,2);
        out.println(miltiplyResult);
    }*/
}
