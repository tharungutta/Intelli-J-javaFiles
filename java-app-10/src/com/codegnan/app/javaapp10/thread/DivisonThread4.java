package com.codegnan.app.javaapp10.thread;

import com.codegnan.app.javaapp10.mathematics.Divison;

import static java.lang.System.out;

public class DivisonThread4 extends Thread{
    public DivisonThread4(){
        super("DIVISON");
        setDaemon(true);
        out.println("MultiplicationThread4()");
    }
    @Override
    public void run(){                                                     // --> RUNNING STATE
        out.println("DivisonThread4 Started and Running........");
        for(int i=1;i<=5;i++) {
            var divison = new Divison();
            long divisonResult = divison.divide(10, 2);
            out.println(divisonResult);
            try {
                Thread.sleep(3000);                                 // --> NOT RUNNING / BLOCKED STATE
            }catch (InterruptedException e){

            }
        }
        out.println("DivisonThread4 ended Running.............");           // --> DEAD STATE
    }
}
