package com.interview.mock.practice2.Number;

import java.util.Scanner;

public class ArmstrongNnumbers {
    static boolean isArmstrong(int num){
        if(num<0){
            return false;
        }
        int sum = 0,  digits = 0;
        int temp = num;
        while (temp != 0){
            digits++;
            temp /= 10;
        }
        temp = num;
        do{
            int digit = temp%10;
            sum += Math.pow(digit,digits);
            temp /= 10;
        }while (temp >0);
        return  sum == num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the limit :");
        int n = sc.nextInt();

        System.out.println("Armstrong numbers from from 1 to "+n+" : ");
        for(int i =1;i<=n;i++){
            if(isArmstrong(i) ){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
