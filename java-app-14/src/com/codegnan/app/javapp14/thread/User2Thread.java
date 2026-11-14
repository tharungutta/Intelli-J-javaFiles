package com.codegnan.app.javapp14.thread;

import java.util.List;

public class User2Thread extends Thread{
    private List<Integer> tokenNumbers;

    public User2Thread(List<Integer> tokenNumbers){
        this.tokenNumbers = tokenNumbers;
    }

    @Override
    public void run(){
        for(int num = 11; num<=20; num++){
            tokenNumbers.add(num);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}