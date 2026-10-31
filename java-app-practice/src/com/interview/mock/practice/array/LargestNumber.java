package com.interview.mock.practice.array;

public class LargestNumber {
    public static void main(String[] args) {
        int []a = {10,30,2,5,80,60};
        int max = a[0];
        for (int i=0;i<a.length;i++){
            if(a[i]>max){
                max = a[i];
            }
        }
        System.out.println(max);
    }
}
