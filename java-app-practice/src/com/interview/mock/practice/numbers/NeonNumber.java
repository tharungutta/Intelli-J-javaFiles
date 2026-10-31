package com.interview.mock.practice.numbers;

// A neon number is a number where the sum of the digits of its square is equal to the original number itself

public class NeonNumber {
    public static void main(String[] args) {
        int num = 9, sum = 0, lastDigit=0;
        int square = num *num;
        while(square>0){
            lastDigit = square%10;
            sum += lastDigit;
            square /= 10;
        }
        if(sum == num){
            System.out.println("it is a Neon number");
        }else{
            System.out.println("It is not a neon number");
        }
    }
}
