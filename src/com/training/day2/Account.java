package com.training.day2;

public class Account {
    private double balance;

    public Account(){
        this.balance = 0;
    }
    public Account(double initialBalance){
        this.balance = initialBalance;
    }

    public void deopist(double amount){
        balance += amount;
        System.out.println("Amount Deposited and balance : " + balance);
    }

    public void withdraw(double amount){
        if (amount <= balance ){
            balance -= amount;
            System.out.println("amount withdraw successfully and balance : " + balance);
        }
        else {
            System.out.println("insufficient balanec");
        }

    }

}
