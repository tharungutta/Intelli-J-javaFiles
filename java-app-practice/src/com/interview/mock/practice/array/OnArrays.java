package com.interview.mock.practice.array;

import java.util.Arrays;

public class OnArrays {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50,60};
        System.out.println(Arrays.toString(a));
        for(int i=0;i<a.length;i++) {
            System.out.println("Index :"+i+" Values: "+a[i]);
        }

        //Add  a value in between the String
        int []arr = new int[a.length+1];
        for(int i=0; i<2;i++) {
            arr[i] = a[i];
        }
        arr[2] = 25;
        for(int i=3 ;i<= a.length;i++) {
            arr[i] = a[i-1];
        }
        System.out.println(Arrays.toString(arr));

        // Remove a value in a string
        int pos=  2 ;
        int newAr[] = new int[arr.length-1];
        for(int i=0;i<pos;i++) {
            newAr[i]= arr[i];
        }
        for(int i =pos ;i<newAr.length;i++) {
            newAr[i]= arr[i+1];
        }
        System.out.println(Arrays.toString(newAr));

        // Sum of the array and Average
        int sum = 0;
        for(int i=0;i<newAr.length;i++) {
            sum += newAr[i];

        }
        int avg = sum / newAr.length;
        System.out.println("Sum:"+sum);
        System.out.println("Avg:"+avg);

        // Max and Min the array
        int max = arr[0];
        int min = arr[0];
        for(int i=0 ;i<newAr.length;i++) {
            if(newAr[i]>max) {
                max = newAr[i];
            }
            if(newAr[i]<min) {
                min = newAr[i];
            }
        }
        System.out.println("MAX:"+max);
        System.out.println("Min:"+min);

        // compare two Arrays: 1. check length 2. check the values

        boolean equal = true;

        if(arr.length != newAr.length) {
            equal = false;
        }else {
            for(int i=0;i<arr.length;i++) {
                if(arr[i]!= newAr[i]) {
                    equal = false;
                    break;
                }
            }
        }
        System.out.println("comapre:"+equal);

        // Merging the arrays:

        int []mergAr = new int [arr.length + newAr.length];
        for(int i=0;i<arr.length;i++) {
            mergAr[i]= arr[i];
        }
        for(int i=arr.length;i<mergAr.length;i++) {
            mergAr[i]= newAr[i-arr.length];
        }
        System.out.println("MergAr:"+ Arrays.toString(mergAr));

// 1. copy the array
        //2. Reverse the array
        //3. second largest element
        //4. Third largest element

    }
}
