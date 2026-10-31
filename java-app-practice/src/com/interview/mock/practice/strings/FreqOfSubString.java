package com.interview.mock.practice.strings;

public class FreqOfSubString {
    public static void main(String[] args) {
        String s1 = "Hi Boss I am Bigg Boss Boss Boss";
        String subString = "Boss";
        String[]res = s1.split(" ");
        int count = 0;
        for(int i=0;i<res.length;i++){
            if(res[i].equals(subString)){
                count++;
            }
        }
        System.out.println("Count of subString :"+count);
    }
}
