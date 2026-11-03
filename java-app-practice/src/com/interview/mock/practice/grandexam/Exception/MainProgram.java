package com.interview.mock.practice.grandexam.Exception;

import java.util.Scanner;

public class MainProgram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount account = new BankAccount("CNRB0011","Tharun",10000);
        // successfull deposit
        try{
            account.deposit(5000);
        }catch(InvalidAmountException e){
            System.out.println("Error:"+e.getMessage());
        }

        // succesfull deposit
        try{
            account.withdraw(4000);
        }catch(InvalidAmountException | InSufficientBalanceException e){
            System.out.println("Error:"+e.getMessage());
        }

        System.out.println("\nFinal Account Details");
        account.displayBalance();
        sc.close();
    }


}
