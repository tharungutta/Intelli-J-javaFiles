package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Addition;

import static java.lang.System.out;

public class AdditionThread3 extends Thread{
    public AdditionThread3(){
        out.println("AdditionThread3()");
    }
    @Override
    public void run(){                                                     // --> RUNNING STATE
        out.println("AditionThread3 Started and Running........");
        for(int i=1;i<=5;i++) {
            var addition = new Addition();
            long addResult = addition.add(10, 2);
            out.println(addResult);
            try {
                Thread.sleep(3000);                                 // --> NOT RUNNING / BLOCKED STATE
            }catch (InterruptedException e){

            }
        }
        out.println("AdditonThread3 ended Running.............");           // --> DEAD STATE
    }
}
