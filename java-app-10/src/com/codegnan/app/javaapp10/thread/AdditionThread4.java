package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Addition;

import static java.lang.System.out;

public class AdditionThread4  extends Thread{
    public AdditionThread4(){
        super("ADDITION");
        setDaemon(true);
        out.println("AdditionThread4()");
    }
    @Override
    public void run(){                                                     // --> RUNNING STATE
        String name = getName();
        out.println(name+"  Started and Running........");
        for(int i=1;i<=5;i++) {
            var addition = new Addition();
            long addResult = addition.add(10, 2);
            out.println(addResult);
            try {
                Thread.sleep(3000);                                 // --> NOT RUNNING / BLOCKED STATE
            }catch (InterruptedException e){

            }
        }
        out.println(name+" ended Running.............");           // --> DEAD STATE
    }
}
