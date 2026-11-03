package com.interview.mock.practice.grandexam.Exception;

public class BankAccount {
    private String accountNumber;
    private String holderName;
    private double balance;

    public BankAccount(String accountNumber, String holderName, double balance) {
        this.accountNumber = accountNumber;
        this.holderName = holderName;
        this.balance = balance;
    }
    public void deposit(double amount) throws InvalidAmountException{
         if(amount <=0){
             throw new InvalidAmountException("Deposit amount must be greater than zero");
         }
         balance += amount;
        System.out.println("Deposit successfull:"+amount);
    }
    public  void withdraw(double amount)throws InvalidAmountException, InSufficientBalanceException{
        if(amount <=0){
            throw new InvalidAmountException("Withdrawl amount must be greater than zero");
        }
        if(amount > balance){
            throw new InSufficientBalanceException("Insufficient Balance");
        }
        balance -= amount;
        System.out.println("Withdraw successgull:"+amount);
    }

    public void displayBalance(){
        System.out.println("Account number:"+accountNumber);
        System.out.println("Holder Name:"+holderName);
        System.out.println("Availble balance:"+balance);
    }

}
