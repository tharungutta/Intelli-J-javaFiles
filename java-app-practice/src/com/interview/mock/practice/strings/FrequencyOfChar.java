package com.interview.mock.practice.strings;

public class FrequencyOfChar {
    public static void main(String[] args) {
        String s1 = "Ramana";
        char ch = 'a';
        int count = 0;
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)== ch){
                count++;
            }
        }
        System.out.println("Count of a:"+count);
    }
}
