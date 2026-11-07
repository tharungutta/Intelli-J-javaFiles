package com.codegnan.app.javaapp11.thread;

import com.codegnan.app.javaapp11.mathematics.Addition;

import static java.lang.System.out;

public class UserThread extends  Thread{
    private String name;
    private int value1, value2;
    private Addition addition;

    public UserThread(String name, int value1, int value2, Addition addition){
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
        addition.add(value1, value2);
        out.println(name+" thread ended....");

    }
}
