package com.interview.mock.practice2.array;

public class LinearSearch {
    public static void main(String[] args) {
        int arr[]= {10,20,30,40,50,60};
        int target = 30;
        int index = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]== target){
                index = i;
                break;
            }
        }
        System.out.println(index!= -1 ?"Found at:"+index:"not found");
    }
}
