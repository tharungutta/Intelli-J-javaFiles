package com.interview.mock.practice2.array;

import java.util.Arrays;

public class CopyElements {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50};
        System.out.println(Arrays.toString(arr));
        int [] copy = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            copy[i]= arr[i];
        }
        System.out.println("Copied array");
        for(int i = 0;i<copy.length;i++){
            System.out.print(copy[i]+" ");
        }
        System.out.println();
        System.out.println(Arrays.toString(copy));
    }
}
