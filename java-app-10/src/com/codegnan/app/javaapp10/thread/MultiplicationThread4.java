package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Multiplication;

import static java.lang.System.out;

public class MultiplicationThread4 extends Thread{
    public MultiplicationThread4(){
        setName("MULTIPLICATION");
       // super("MULTIPLICATION");
        setDaemon(true);
        out.println("MultiplicationThread4()");
    }
    @Override
    public void run(){                                                     // --> RUNNING STATE
        String name = getName();
        out.println(name+"  Started and Running........");
        for(int i=1;i<=5;i++) {
            var multiplication = new Multiplication();
            long multiplicationResult = multiplication.multiply(10, 2);
            out.println(multiplicationResult);
            try {
                Thread.sleep(3000);                                 // --> NOT RUNNING / BLOCKED STATE
            }catch (InterruptedException e){

            }
        }
        out.println("MultiplicationThread4 ended Running.............");           // --> DEAD STATE
    }
}
