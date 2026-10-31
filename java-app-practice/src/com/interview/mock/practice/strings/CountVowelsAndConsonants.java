package com.interview.mock.practice.strings;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        s1 = s1.toLowerCase();
        int vowels = 0, consonants = 0;
        for(int i=0;i<s1.length();i++){
            char ch = s1.charAt(i);

            if(ch >= 'a' && ch<='z'){
                if(ch =='a'|| ch=='e'|| ch=='i'|| ch =='o'|| ch=='u'){
                    vowels++;
                }else{
                    consonants++;
                }
            }
        }
        System.out.println(vowels);
        System.out.println(consonants);
    }
}
