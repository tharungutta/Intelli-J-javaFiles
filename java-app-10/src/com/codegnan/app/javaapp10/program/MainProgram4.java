package com.codegnan.app.javaapp10.program;

import com.codegnan.app.javaapp10.thread.AdditionThread4;
import com.codegnan.app.javaapp10.thread.DivisonThread4;
import com.codegnan.app.javaapp10.thread.MultiplicationThread4;
import com.codegnan.app.javaapp10.thread.SubtractionThread4;

import static java.lang.System.out;

public class MainProgram4 {
    public static void main(String[] args) {
        out.println("Main method started...");
        AdditionThread4 additionThread4 = new AdditionThread4();      // --> NEW THREAD STATE
        additionThread4.start();                                      // --> RUNNABLE / READY-TO-RUN STATE
        out.println(additionThread4.getName()+" Started.......");

        SubtractionThread4 subtractionThread4 = new SubtractionThread4();      // --> NEW THREAD STATE
        subtractionThread4.start();                                      // --> RUNNABLE / READY-TO-RUN STATE
        out.println(subtractionThread4.getName()+" Started.......");

        MultiplicationThread4 multiplicationThread4 = new MultiplicationThread4();      // --> NEW THREAD STATE
        multiplicationThread4.start();                                      // --> RUNNABLE / READY-TO-RUN STATE
        out.println(multiplicationThread4.getName()+" Started.......");

        DivisonThread4 divisonThread4 = new DivisonThread4();      // --> NEW THREAD STATE
        divisonThread4.start();                                      // --> RUNNABLE / READY-TO-RUN STATE
        out.println(divisonThread4.getName()+" Started.......");

        out.println("Main method ended....");
    }
}
