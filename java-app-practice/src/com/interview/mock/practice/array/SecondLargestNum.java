package com.interview.mock.practice.array;

public class SecondLargestNum {
    public static void main(String[] args) {
        int []a = {10,20,30,40,50,60,55,90};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for (int value: a){
            if(value > largest){
                secondLargest = largest;
                largest = value;
            }else if(value > secondLargest && value< largest){
                secondLargest = value;
            }
        }
        System.out.println("second largest value : "+secondLargest);
        System.out.println(largest);
    }
}
