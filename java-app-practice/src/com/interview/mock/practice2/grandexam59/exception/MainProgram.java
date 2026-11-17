package com.interview.mock.practice2.grandexam59.exception;

public class MainProgram {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("CNRB001100","Tharun",1000);
        // succesdfull deposit
        try{
            account.deposit(5000);
        }catch (InavlidAmountException e){
            System.out.println("Error:"+e.getMessage());
        }
        // successful withdrawl

        try{
            account.withdraw(2000);
        }catch (InavlidAmountException | InsufficientBalanceException e){
            System.out.println("Error:"+e.getMessage());
        }

        System.out.println("\nFinal Account Details");
        account.displayBalance();

    }
}
