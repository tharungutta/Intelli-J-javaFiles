package com.interview.mock.practice2.grandexam59.exception;

import com.interview.mock.practice.grandexam.Exception.InvalidAmountException;

public class BankAccount {
    private String accountNum;
    private String name;
    private double balance;

    public BankAccount(String accountNum, String name, double balance) {
        this.accountNum = accountNum;
        this.name = name;
        this.balance = balance;
    }
    public void deposit(double amount)throws InavlidAmountException{
        if(amount <=0){
            throw new InavlidAmountException("Deposit amount must be greater than zero");
        }
        balance += amount;
        System.out.println("Successfull deposit:"+amount);
    }
    public void withdraw(double amount)throws InavlidAmountException ,InsufficientBalanceException{
        if(amount <=0){
            throw new InavlidAmountException("withdrwal amount must be greater thgan zero");
        }
        if(amount > balance){
            throw  new InsufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdraw successfull:"+amount);
    }

    public void displayBalance(){
        System.out.println("Acc num:"+accountNum);
        System.out.println("name:"+name);
        System.out.println("Available ablance:"+ balance);
    }
}
