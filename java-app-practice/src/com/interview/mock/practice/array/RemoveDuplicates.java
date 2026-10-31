package com.interview.mock.practice.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,2,1,3,5,6};
        for(int i=0;i<a.length;i++){
            for (int j=i+1;j<a.length;j++){
                if(a[i]== a[j]){
                    a[j]= Integer.MAX_VALUE;
                }
            }
            if(a[i]!= Integer.MAX_VALUE){
                System.out.print(a[i]+" ");
            }
        }
    }
}
