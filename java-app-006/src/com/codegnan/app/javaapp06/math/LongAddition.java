package com.codegnan.app.javaapp06.math;

public class LongAddition implements Addition {
    private long num1;
    private long num2;

    public LongAddition(long num1, long num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    @Override
    public long add() {
        long result = num1 + num2;
        return result;
    }
}
