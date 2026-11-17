package com.interview.mock.practice2.string;

public class ReverseSentence {
    public static void main(String[] args) {
        String s1 = "Java For Life";
        System.out.println(s1);
        String[] res = s1.split(" ");
        for(int i= res.length-1;i>=0;i--){
            System.out.print(res[i]+" ");
        }
        System.out.println();
    }
}
