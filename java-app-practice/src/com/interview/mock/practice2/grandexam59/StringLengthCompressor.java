package com.interview.mock.practice2.grandexam59;

import java.util.Scanner;

public class StringLengthCompressor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String: ");
        String str = sc.nextLine();

        String compressed = compress(str);
        System.out.println("Compressed String: " + compressed);
        sc.close();
    }

    public static String compress(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }

        StringBuilder result = new StringBuilder();
        int count = 1;

        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;
            } else {
                result.append(str.charAt(i - 1)).append(count);
                count = 1;
            }
        }

        result.append(str.charAt(str.length() - 1)).append(count);

        return result.length() > str.length() ? str : result.toString();
    }
}