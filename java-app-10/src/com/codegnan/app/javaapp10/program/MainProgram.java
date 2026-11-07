package com.codegnan.app.javaapp10.program;

import com.codegnan.app.javaapp10.thread.AdditionThread;
import com.codegnan.app.javaapp10.thread.DivisonThread;
import com.codegnan.app.javaapp10.thread.MultiplicationThread;
import com.codegnan.app.javaapp10.thread.SubtractionThread;

public class MainProgram {
    public static void main(String[] args) {

        var additionThread = new AdditionThread();
        var subtractionThread = new SubtractionThread();
        var multiplicationThread = new MultiplicationThread();
        var divisonThread = new DivisonThread();

        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisonThread.start();


    }
}
