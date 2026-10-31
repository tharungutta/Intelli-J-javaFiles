package com.interview.mock.practice.strings;

import java.util.Arrays;

public class StringToStringArray {
    public static void main(String[] args) {
        String s1 = "God is great";
        String[] res = s1.split("");
        System.out.println(Arrays.toString(res));
        System.out.println(res.length);
        String[] res2 = s1.split(" ");
        System.out.println(Arrays.toString(res2));
        System.out.println(res2.length);
    }
}
