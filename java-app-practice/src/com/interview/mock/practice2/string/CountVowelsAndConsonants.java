package com.interview.mock.practice2.string;

public class CountVowelsAndConsonants {
    public static void main(String[] args) {
        String s1 = "Java Programming";
        s1 = s1.toLowerCase();
        int vowels = 0, consonants = 0;
        char ch[]= s1.toCharArray();
        for(int i =0;i<ch.length;i++){
            if(ch[i] >='a' && ch[i] <= 'z'){
                if(ch[i] == 'a'|| ch[i] =='e'|| ch[i] == 'i'|| ch[i] =='o'|| ch[i] == 'u'){
                    vowels++;
                }else {
                    consonants++;
                }
            }
        }
        System.out.println("Vowels:"+vowels);
        System.out.println("Consonants:"+consonants);
    }
}
