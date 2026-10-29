package com.codegnan.app.javaapp06.operation;

import com.codegnan.app.javaapp06.math.Addition;
import com.codegnan.app.javaapp06.math.IntAddition;
import com.codegnan.app.javaapp06.math.LongAddition;

public class AdditionOperations {
    public int addTwoNumbers(int num1, int num2){
        int result = 0;
        var intAddition = new IntAddition(num1,num2);
        result = (int)intAddition.add();
        return result;
    }


    public int addThreeNumbers(int num1, int num2, int num3){
        int result = 0;

        // LAMBDA EXPRESSION
        Addition addition = () -> num1 + num2 + num3;
//        Addition addition = ()-> {
//            return num1 + num2 + num3;
//        } ;
        result = (int) addition.add();
        return result;

        //ANONYMOUS INNER CLASS
//        Addition addition = new Addition() {
//            @Override
//            public long add() {
//                return (long) num1 + num2 + num3;
//            }
//        };
//          return (int)addition.add();


    }

    public long addTwoNumbers(long num1, long num2){
        long result = 0;
        var longAddition = new LongAddition(num1, num2);
        result = longAddition.add();
        return result;
    }
}
