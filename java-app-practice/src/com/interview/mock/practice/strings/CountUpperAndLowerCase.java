package com.interview.mock.practice.strings;

public class CountUpperAndLowerCase {
    public static void main(String[] args) {
        String s1 = "ThaRuN";
        char []ch = s1.toCharArray();
        int uppperCount = 0, lowerCount = 0;
        for(int i=0;i<ch.length;i++){
            if(ch[i]>='A' && ch[i]<='Z'){
                uppperCount++;
            }else{
                lowerCount++;
            }
        }
        System.out.println("No of uppercase letters:"+uppperCount);
        System.out.println("No of lowercase letters:"+lowerCount);
    }
}
