package com.codegnan.app.javaapp12.thread;

import static java.lang.System.out;

public class ThreadB extends Thread{
    public ThreadB(){
        super("ThreadB");
        out.println(getName()+" created");
    }
    @Override
    public void run(){
        out.println(getName()+" started running");
        for(int i=1; i<=10;i++){
            try{
                out.println(getName()+" running.....");
                Thread.sleep(2000);
            }catch (InterruptedException interruptedException){
                interruptedException.printStackTrace();
            }
        }
        out.println(getName()+" ended runing..");
    }
}
