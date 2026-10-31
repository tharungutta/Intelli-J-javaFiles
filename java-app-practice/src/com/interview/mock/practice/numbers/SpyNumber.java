package com.interview.mock.practice.numbers;

public class SpyNumber {                  // sum of digits = product of digits
    public static void main(String[] args) {
        int num = 132, lastDigit = 0 , sum =0, product = 1;
        while(num>0){
            lastDigit = num%10;
            sum += lastDigit;
            product *= lastDigit;
            num /= 10;
        }
        if(sum == product){
            System.out.println("It is a SPY number");
        }else{
            System.out.println("It is not a spy number");
        }
    }
}
