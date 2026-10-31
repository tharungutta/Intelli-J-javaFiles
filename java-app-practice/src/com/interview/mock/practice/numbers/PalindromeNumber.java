package com.interview.mock.practice.numbers;

public class PalindromeNumber {
    public static void main(String[] args) {
        int num = 121;
        int rev = 0;
        int temp = num;
        while (temp>0){
            int last = temp%10;
            rev = rev*10+last;
            temp /= 10;

        }
        if(num == rev){
            System.out.println("It is a palindrome");
        }else{
            System.out.println("It is not a palindrome number");
        }
    }
}
