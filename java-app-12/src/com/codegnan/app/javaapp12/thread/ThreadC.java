package com.codegnan.app.javaapp12.thread;

import static java.lang.System.out;

public class ThreadC extends  Thread{
    public ThreadC(){
        super("ThreadC");
        out.println(getName()+" created");
    }
    @Override
    public void run(){
        out.println(getName()+" started running");
        for(int i=1; i<=15;i++){
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
