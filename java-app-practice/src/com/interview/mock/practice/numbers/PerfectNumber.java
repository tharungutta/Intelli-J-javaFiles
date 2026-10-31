package com.interview.mock.practice.numbers;
// A perfect number is a positive integer that equals the sum of its proper positive divisors,
//                                                                        meaning all divisors except the number itself.
public class PerfectNumber {
    public static void main(String[] args) {
       int num = 6, sum = 0;
       for(int i=1; i<num;i++){
           if(num%i==0){
               sum +=i ;
           }
       }
       if (sum == num){
           System.out.println("It is a perfect num");
       }else{
           System.out.println("It is not a perfect num");
       }
    }
}
