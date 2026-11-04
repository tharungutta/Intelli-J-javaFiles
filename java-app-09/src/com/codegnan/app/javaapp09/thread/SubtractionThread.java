package com.codegnan.app.javaapp09.thread;

import com.codegnan.app.javaapp09.mathematics.Addition;
import com.codegnan.app.javaapp09.mathematics.Subtraction;

import static java.lang.System.out;

public class SubtractionThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=7;i++) {
            var subtraction = new Subtraction();
            long subtractResult = subtraction.subtract(10,2);
            out.println(subtractResult);
            try {
                Thread.sleep(2000);
            }catch (InterruptedException e){

            }
        }
    }

    /*@Override
    public void run(){
        for(int i=1;i<=5;i++) {
            var subtraction = new Subtraction();
            long subtractResult = subtraction.subtract(10,2);
            out.println(subtractResult);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }*/

    /*@Override
    public void run(){
        var subtraction = new Subtraction();
        long subtractResult = subtraction.subtract(10,2);
        out.println(subtractResult);
    }*/
}
