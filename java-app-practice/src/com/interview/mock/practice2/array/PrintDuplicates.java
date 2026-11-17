package com.interview.mock.practice2.array;

public class PrintDuplicates {
    public static void main(String[] args) {
        int []a = {1,2,2,3,1,3,2,3,5,6,7,8,9};
        for(int i = 0;i<a.length;i++){
            int count = 1;
            for(int j = i+1;j<a.length;j++){
                if(a[i] == a[j]){
                    count++;
                    a[j]= Integer.MAX_VALUE;
                }
            }
            if(a[i]!=Integer.MAX_VALUE && count>1){
                System.out.print(a[i]+" ");
            }
        }
    }
}
