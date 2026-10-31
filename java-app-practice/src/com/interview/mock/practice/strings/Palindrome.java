package com.interview.mock.practice.strings;

public class Palindrome {
    public static void main(String[] args) {
        String s1 = "mom";
        String rev = "";
        for(int i = s1.length()-1;i>=0;i--){
            rev += s1.charAt(i);
        }
        if(s1.equalsIgnoreCase(rev)){
            System.out.println("Palindrome");
        }else {
            System.out.println("Not an palindrome");
        }
    }
}
