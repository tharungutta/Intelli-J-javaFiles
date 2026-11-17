package com.interview.mock.practice2.string;

public class CountUppercaseAndLowercase {
    public static void main(String[] args) {
        String s1 = "ThaRuN";
        char []ch = s1.toCharArray();
        int upperCount = 0, lowerCount = 0;
        for(int i = 0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                upperCount++;
            }else {
                lowerCount++;
            }
        }
        System.out.println("Upper case letters:"+upperCount);
        System.out.println("Lower case letters:"+lowerCount);
    }
}
