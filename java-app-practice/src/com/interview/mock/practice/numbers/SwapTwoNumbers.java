package com.interview.mock.practice.numbers;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        int a = 10 , b = 20;
        System.out.println("Before swapping: "+a+" "+b);
        int temp = a;
        a = b;
        b = temp;
        System.out.println("After swapping:"+a+" "+b);
    }
}
