package com.codegnan.app.javaapp06.program;

import com.codegnan.app.javaapp06.operation.AdditionOperations;

import static java.lang.System.out;

public class MainProgram {
    public static void main(String[] args) {

        var additionOperations = new AdditionOperations();

        var intNumberResult = additionOperations.addTwoNumbers(10,2);
        out.println("Result of adding two int numbers is :"+intNumberResult );

        var longNumberResult = additionOperations.addTwoNumbers(10L, 2L);
        out.println("Result of adding two long numbers is :"+longNumberResult);

        // ADD THREE NUMBERS USING add METHOD FROM addition INTERFACE
       var threeNumberResult = additionOperations.addThreeNumbers(10,20,30);
       out.println("Result of adding three numbers is:"+threeNumberResult);


    }
}
