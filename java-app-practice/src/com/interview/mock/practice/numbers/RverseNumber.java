package com.interview.mock.practice.numbers;

public class RverseNumber {
    public static void main(String[] args) {
        int num = 12345;
        int rev = 0;
        while(num !=0){
            int last = num%10;
            rev = rev*10+last;
            num /= 10;
        }
        System.out.println(rev);
    }
}
