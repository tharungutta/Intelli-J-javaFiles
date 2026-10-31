package com.interview.mock.practice.strings;

import java.util.Arrays;

public class ReverseSentence {
    public static void main(String[] args) {
        String s1 = "Java for Life";
        System.out.println(s1);
        String[] res = s1.split(" ");
        System.out.println(Arrays.toString(res));
        for(int i = res.length-1;i>=0;i--){
            System.out.print(res[i]+" ");
        }
    }
}
