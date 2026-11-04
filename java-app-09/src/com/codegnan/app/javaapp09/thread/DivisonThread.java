package com.codegnan.app.javaapp09.thread;

import com.codegnan.app.javaapp09.mathematics.Division;
import com.codegnan.app.javaapp09.mathematics.Subtraction;

import static java.lang.System.out;

public class DivisonThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            var division = new Division();
            long divisionResult = division.divide(10,2);
            out.println(divisionResult);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }
   /* @Override
    public void run(){
        var division = new Division();
        long divisionResult = division.divide(10,2);
        out.println(divisionResult);
    }*/
}
