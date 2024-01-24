package com.training.day2;

public class AccountView extends Account {
    public static void main(String[] args) {
        Account obj = new Account();
        obj = new Account(100);


        obj.deopist(100);
        obj.withdraw(500);
    }
}
