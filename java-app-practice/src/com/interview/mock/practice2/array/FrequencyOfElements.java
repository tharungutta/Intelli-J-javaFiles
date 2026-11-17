package com.interview.mock.practice2.array;

public class FrequencyOfElements {
    public static void main(String[] args) {
        int a[]= {1,2,3,4,1,3,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++){
            int count = 1;
            if(a[i] == -1){
                continue;
            }
            for(int j = i+1;j<a.length;j++){
                if(a[i]== a[j]){
                    count++;
                    a[j]= -1;
                }
            }
            System.out.println(a[i]+" occurs"+count+" times");
        }
    }
}
