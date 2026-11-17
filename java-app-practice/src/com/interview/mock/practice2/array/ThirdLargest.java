package com.interview.mock.practice2.array;

import java.util.Arrays;

public class ThirdLargest {
    public static void main(String[] args) {
        int []a = {10,20,340,40,50,60};
        Arrays.sort(a);
        int distinctCount = 0;
        int previous = 0;
        for(int i= a.length-1;i>= 0;i--){
            if(distinctCount ==0 || a[i]!= previous){
                distinctCount++;
                previous = a[i];

                if(distinctCount == 3){
                    System.out.print("ThirdLargest:"+a[i]);
                    return;
                }
            }
        }
    }
}
