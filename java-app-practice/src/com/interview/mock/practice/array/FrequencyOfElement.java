package com.interview.mock.practice.array;

public class FrequencyOfElement {
    public static void main(String[] args) {
        int a[]= {1,2,3,1,2,3,4,5,6};
         for(int i=0;i<a.length;i++){
             int count = 1;
             if(a[i]== -1)
                 continue;
             for(int j = i+1;j<a.length;j++){
                 if(a[i]== a[j]){
                     count++;
                     a[j] = -1;
                 }
             }
             System.out.println(a[i]+" occurs "+ count+" times");
         }
    }
}
