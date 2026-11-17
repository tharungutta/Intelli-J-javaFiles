package com.interview.mock.practice2.array;

public class SecondLargest {
    public static void main(String[] args) {
        int []a = {10,20,340,40,50,60};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        for(int value : a){
            if(value >largest){
                secondLargest = largest;
                largest = value;
            }else if(value> secondLargest && value< largest){
                secondLargest = value;
            }
        }
        System.out.println(" 2nd Largest:"+secondLargest);
        System.out.println("Largest:"+largest);
    }
}
