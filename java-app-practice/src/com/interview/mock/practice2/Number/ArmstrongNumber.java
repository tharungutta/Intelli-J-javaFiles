package com.interview.mock.practice2.Number;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number :");
        int num = sc.nextInt();
        int sum = 0 , digits = 0;
        int temp = num;
        // calculate no of digits
        while (temp != 0){
            digits++;
            temp = temp/10;
        }
        temp = num;
        while (temp != 0){
            int digit = temp%10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }
        if(sum == num){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong number");
        }

    }
}
