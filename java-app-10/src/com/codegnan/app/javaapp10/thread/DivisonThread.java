package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Divison;

import static java.lang.System.out;

public class DivisonThread extends Thread{
    @Override
    public void run(){
        for(int i=1;i<=5;i++) {
            var division = new Divison();
            long divisionResult = division.divide(10,2);
            out.println(divisionResult);
            try {
                Thread.sleep(3000);
            }catch (InterruptedException e){

            }
        }
    }

}
