package com.codegnan.app.javapp14.thread;

import java.util.List;

public class User1Thread extends Thread{
    private List<Integer> tokenNumbers;

    public User1Thread(List<Integer> tokenNumbers){
        this.tokenNumbers = tokenNumbers;
    }

    @Override
    public void run(){
        for(int num = 1; num<=10; num++){
            tokenNumbers.add(num);
            try {
                Thread.sleep(1000);
            }catch (InterruptedException ex){
                ex.printStackTrace();
            }
        }
    }
}
