package com.interview.mock.practice.array;

public class PrintDuplicates {
    public static void main(String[] args) {
        int []a = {1,2,2,1,4,5,6,7,5,6,9};
        for(int i=0;i<a.length;i++){
            int count = 1;
            for(int j=i+1;j<a.length;j++){
                if(a[i]== a[j]){
                    count++;
                    a[j]= Integer.MAX_VALUE;
                }
            }
            if(a[i]!= Integer.MAX_VALUE && count>1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
