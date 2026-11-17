package com.interview.mock.practice2.array;

public class RemoveDuplicates {
    public static void main(String[] args) {
        int []a = {1,2,2,3,1,3,2,3,5,6,7,8,9};
        for(int i=0;i<a.length;i++){
            for(int j = i+1;j<a.length;j++){
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
