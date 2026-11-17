package com.interview.mock.practice2.array;

import java.util.Arrays;

public class ZerosToRight {
    public static void main(String[] args) {
        int a[]= {1,2,0,3,7,4,0,4,5};
//        int index = 0;
//        // Move the non - zero elements forward
//        for (int i =0;i<a.length;i++){
//            if(a[i]!=0){
//                a[index++]= a[i];
//            }
//        }
//        // fill remian with zeros
//        while(index<a.length){
//            a[index++]= 0;
//        }
//        System.out.println(Arrays.toString(a));

// move non zeros elements to the right
        int index = a.length-1;
        for(int i = a.length-1;i>=0;i--){
            if(a[i]!= 0){
                a[index--]= a[i];
            }
        }
        // fill remian with zeros
        while (index >= 0){
            a[index--]= 0;
        }
        System.out.println(Arrays.toString(a));
    }
}
