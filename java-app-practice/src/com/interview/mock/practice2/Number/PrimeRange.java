package com.interview.mock.practice2.Number;

import java.util.Scanner;

public class PrimeRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the prime range:");
        int range = sc.nextInt();
        for(int num =2 ;num<=range;num++){
            boolean isPrime = true;
            for(int i =2;i*i<=num;i++){
                if(num%i == 0){
                    isPrime = false;
                    break;
                }
            }
            if(isPrime){
                System.out.print(num+" ");
            }
        }
    }
}
