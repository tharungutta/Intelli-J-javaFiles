package com.interview.mock.practice.numbers;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if(num<=1){
            System.out.println(num+" it is not a prime number");
            return;
        }
        boolean isPrime = true;
        for(int i=2 ; i*i <=num ;i++){
            if(num%i == 0){
                isPrime = false;
                break;
            }
        }
        if(isPrime){
            System.out.println("It is a prime number");
        }else {
            System.out.println("It is not a prime number");
        }
    }
}
