package com.codegnan.app.javaapp10.program;

import com.codegnan.app.javaapp10.thread.*;

public class MainProgram2 {
    public static void main(String[] args) {

        var additionThread = new AdditionThread2();
        var subtractionThread = new SubtractionThread2();
        var multiplicationThread = new MultiplicationThread2();
        var divisionThread = new DivisonThread2();

        Thread thread1 = new Thread(additionThread);
        Thread thread2 = new Thread(subtractionThread);
        Thread thread3 = new Thread(multiplicationThread);
        Thread thread4 = new Thread(divisionThread);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
