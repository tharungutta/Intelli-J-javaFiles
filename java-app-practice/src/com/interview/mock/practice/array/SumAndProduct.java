package com.interview.mock.practice.array;

import java.util.Arrays;

public class SumAndProduct {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,5,6,7,8,9};
        System.out.println("Array"+ Arrays.toString(a));
        int sum = 0, product = 1,count = 0;
        for(int i=0;i<a.length;i++){
            if(a[i]%2==1){
                sum += a[i];
                product *= a[i];
                count++;
            }
        }
        System.out.println("No of odd elemnts is:"+count);
        System.out.println("Sum of Odd elements is:"+sum);
        System.out.println("Product of Odd elemnts is:"+product);
    }

}
