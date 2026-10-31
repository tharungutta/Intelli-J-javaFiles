package com.interview.mock.practice.array;

import java.util.Arrays;
import java.util.Scanner;

public class ZerosToRight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the array size");
        int n = sc.nextInt();
        int []arr = new int[n];
        System.out.println("Enter the array elements: ");
        for(int i =0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int index = 0;
        // MOVE NON-ZERO ELEMENTS FORWARD
        for(int i =0;i<n;i++){
            if(arr[i]!=0){
                arr[index++] = arr[i];
            }
        }
        // FILL REMAIN WITH ZEROS
        while (index<n){
            arr[index++]=0;
        }
        System.out.println("Array after moving zero's to right");
        System.out.println(Arrays.toString(arr));
    }
}
