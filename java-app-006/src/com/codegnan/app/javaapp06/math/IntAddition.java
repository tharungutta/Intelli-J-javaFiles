package com.codegnan.app.javaapp06.math;

public class IntAddition implements Addition{
    private  int num1;
    private int num2;

    public IntAddition(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public long add() {
         long result = num1 + num2;
         return result;
    }
}
