package com.training.day3;

public class Product implements Taxable{
    private int pid;
    private double price;
    private int quantity;

    public Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
    @Override
    public void calTax() {
        double salesTaxAmount = price * quantity * salesTax;
        System.out.println("Sales Tax for product with pid " + pid + ": $" + salesTaxAmount);

    }
}
