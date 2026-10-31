package com.interview.mock.practice.array;

public class CountElements {
    public static void main(String[] args) {
        int []a = {10,20,30,40};
        int count = 0;
        for(int i=0;i<a.length;i++){
            count++;
        }
        System.out.println("No of elemnts:"+count);
    }
}
