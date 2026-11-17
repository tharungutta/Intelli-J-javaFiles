package com.interview.mock.practice2.Number;

public class SwapTwoNum {
    public static void main(String[] args) {
        int a = 10, b= 20;

//        int temp = a;
//        a= b;
//        b = temp;

        // Without using third variable  + opeartor
//        a = a+b; // 30
//        b = a-b; // 10;
//        a = a-b; // 20;

        // Without using third variable  ^ opeartor

        a = a^b; // 30
        b = a^b; // 10;
        a = a^b; // 20;
        System.out.println(a+" "+b);

    }
}
