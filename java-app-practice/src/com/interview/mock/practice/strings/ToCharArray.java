package com.interview.mock.practice.strings;

public class ToCharArray {
    public static void main(String[] args) {
        String s1 = "Tharun";
        char []ch = s1.toCharArray();
        for(int i=0; i<ch.length;i++){
            System.out.print(ch[i]+" ");
        }
    }
}
