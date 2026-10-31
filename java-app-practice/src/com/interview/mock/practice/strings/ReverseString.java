package com.interview.mock.practice.strings;

public class ReverseString {
    public static void main(String[] args) {
        String s1 = "Tharun";
        for(int i = s1.length()-1;i>=0;i--){
            System.out.print(s1.charAt(i));
        }
    }
}
