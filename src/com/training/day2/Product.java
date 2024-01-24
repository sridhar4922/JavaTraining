package com.training.day2;

public class Product {
    private int pid;
    private int price;
    private int quantity;

    public Product(int pid, int price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }

    public int getpid() {
        return pid;
    }

    public int getprice() {
        return price;
    }

    public int getquantity() {
        return quantity;
    }
}

