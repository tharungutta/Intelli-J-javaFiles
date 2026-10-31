package com.interview.mock.practice.strings;

import java.util.Arrays;

public class Anagram {
    public static void main(String[] args) {
        String s1 = "Listen";
        String s2 = "Silent";

        // REMOVE SPACES AND CONVERT TO LOWERCASE
        s1  = s1.replaceAll("\\s","").toLowerCase();
        s2 = s2.replaceAll("\\s"," ").toLowerCase();

        //  CHECK FOR LENGTH
        if(s1.length() != s2.length()){
            System.out.println("Not an anagram");
        }
        char[] a1 = s1.toCharArray();
        char[] a2 = s2.toCharArray();

        Arrays.sort(a1);
        Arrays.sort(a2);
        if(Arrays.equals(a1,a2)){
            System.out.println("Anagram");
        }else{
            System.out.println("Not an anagram");
        }
    }
}
