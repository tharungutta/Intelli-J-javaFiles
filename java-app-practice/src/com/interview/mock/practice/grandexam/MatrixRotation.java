package com.interview.mock.practice.grandexam;

import java.util.Scanner;

public class MatrixRotation{

        public static  void rotate(int[][] matrix,int n){
            // transpose the matrix
            for(int i=0;i<n;i++){
                for(int j = i+1;j<n;j++){
                    int temp = matrix[i][j];
                    matrix[i][j]= matrix[j][i];
                    matrix[j][i]= temp;
                }
            }
            //Reverse each row
            for(int i=0;i<n;i++){
                int left = 0;
                int right = n-1;
                while(left < right){
                    int temp = matrix[i][left];
                    matrix[i][left]= matrix[i][right];
                    matrix[i][right]= temp;
                    left++;
                    right--;
                }
            }
        }
        public static void display(int[][] matrix, int n){
            for(int i=0;i<n;i++){
                for(int j=0;j<n;j++){
                    System.out.print(matrix[i][j]+ " ");
                }
                System.out.println();
            }
        }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the matrix size:");
        int n = sc.nextInt();
        if(n<1){
            System.out.println("Invalid matrix size");
            sc.close();
            return;
        }
        int [][] matrix = new int[n][n];
        System.out.println("Enter the matrix ele: ");
        for(int i=0; i<n;i++){
            for(int j =0;j<n;j++){
                matrix[i][j]= sc.nextInt();
            }
        }
        System.out.println("Original matrix:");
        display(matrix,n);
        rotate(matrix,n);
        System.out.println("Rotated matrix: ");
        display(matrix,n);
        sc.close();
    }
}