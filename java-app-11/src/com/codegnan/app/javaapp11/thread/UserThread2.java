package com.codegnan.app.javaapp11.thread;

import com.codegnan.app.javaapp11.mathematics.Addition;
import com.codegnan.app.javaapp11.mathematics.Addition2;

import static java.lang.System.out;

public class UserThread2 extends Thread{
    private String name;
    private int value1, value2;
    private Addition2 addition;

    public UserThread2(String name, int value1, int value2, Addition2 addition){
        super(name);
        this.name = name;
        this.value1 = value1;
        this.value2 = value2;
        this.addition = addition;
    }

    @Override
    public void run(){
        out.println(name+" thread running..");
        out.println(name+" thread performing Addition");
        addition.setNum1(value1);
        addition.setNum2(value2);
        addition.add();
        out.println(name+" thread ended....");

    }
}
