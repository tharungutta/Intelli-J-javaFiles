package com.interview.mock.practice.array;

import java.util.Arrays;

public class  CopyElements {
    public static void main(String[] args) {
        int []a = {10,20,30,40};
        System.out.println("Original array");
        System.out.println(Arrays.toString(a));
        int []copy = new int[a.length];
        for(int i=0;i<a.length;i++){
            copy[i]= a[i];
        }
        System.out.println("Copied elements");
        for(int i=0;i<copy.length;i++){
            System.out.print(copy[i]+" ");

        }
    }
}
