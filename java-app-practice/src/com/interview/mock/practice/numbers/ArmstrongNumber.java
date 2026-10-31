package com.interview.mock.practice.numbers;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0, digits = 0;
        int temp = num;
        //CALCULATE THE NO OF DIGITS
        while (temp != 0){
            digits++;
            temp /= 10;
        }
        temp = num;
        //CALCULATE ARMSTRONG NUM LOGIC
        while (temp != 0){
            int digit = temp%10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }
        if(sum == num){
            System.out.println("It is a Armstrong number");
        }else {
            System.out.println("It is not a armstrong number");
        }
    }
}
