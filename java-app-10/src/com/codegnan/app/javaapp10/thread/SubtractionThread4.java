package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Subtraction;

import static java.lang.System.out;

public class SubtractionThread4 extends Thread{
    public SubtractionThread4(){
        super("SUBTRACTION");
        setDaemon(true);
        out.println("SubtractionThread4()");
    }
    @Override
    public void run(){                                                     // --> RUNNING STATE
        String name = getName();
        out.println(name+"  Started and Running........");
        for(int i=1;i<=5;i++) {
            var subtraction = new Subtraction();
            long subtractionResult = subtraction.subtract(10, 2);
            out.println(subtractionResult);
            try {
                Thread.sleep(3000);                                 // --> NOT RUNNING / BLOCKED STATE
            }catch (InterruptedException e){

            }
        }
        out.println("SubtractionThread4 ended Running.............");           // --> DEAD STATE
    }
}
