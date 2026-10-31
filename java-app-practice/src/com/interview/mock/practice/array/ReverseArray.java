package com.interview.mock.practice.array;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5};

        int left = 0;
        int right = a.length-1;
        while(left<right){
            int temp = a[left];
            a[left]= a[right];
            a[right]= temp;
            left++;
            right--;
        }
//        for(int value :a){
//            System.out.print(value+" ");
//        }
        System.out.println(Arrays.toString(a));

    }
}
