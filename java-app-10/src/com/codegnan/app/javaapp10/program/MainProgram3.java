package com.codegnan.app.javaapp10.program;

import com.codegnan.app.javaapp10.thread.AdditionThread3;

import static java.lang.System.out;

public class MainProgram3 {
    public static void main(String[] args) {
        AdditionThread3 additionThread3 = new AdditionThread3();      // --> NEW THREAD STATE
        additionThread3.start();                                      // --> RUNNABLE / READY-TO-RUN STATE
        out.println("AdditionThread3 Started.......");
    }
}
