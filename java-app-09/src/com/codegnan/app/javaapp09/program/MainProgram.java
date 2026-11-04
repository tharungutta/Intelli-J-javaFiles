package com.codegnan.app.javaapp09.program;

import com.codegnan.app.javaapp09.mathematics.Addition;
import com.codegnan.app.javaapp09.mathematics.Division;
import com.codegnan.app.javaapp09.mathematics.Multiplication;
import com.codegnan.app.javaapp09.mathematics.Subtraction;
import com.codegnan.app.javaapp09.thread.AdditionThread;
import com.codegnan.app.javaapp09.thread.DivisonThread;
import com.codegnan.app.javaapp09.thread.MultiplicationThread;
import com.codegnan.app.javaapp09.thread.SubtractionThread;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {

        AdditionThread additionThread = new AdditionThread();
        SubtractionThread subtractionThread = new SubtractionThread();
        MultiplicationThread multiplicationThread = new MultiplicationThread();
        DivisonThread divisonThread = new DivisonThread();

        additionThread.start();
        subtractionThread.start();
        multiplicationThread.start();
        divisonThread.start();

       /* var addition = new Addition();
        var subtraction = new Subtraction();
        var multiplication = new Multiplication();
        var division = new Division();

        long addResult = addition.add(10,2);
        out.println(addResult);
        long subtractResult = subtraction.subtract(10,2);
        out.println(subtractResult);
        long miltiplyResult = multiplication.multiply(10,2);
        out.println(miltiplyResult);
        long divisionResult = division.divide(10,2);
        out.println(divisionResult);*/

    }
}
