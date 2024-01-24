package com.training.day2;

import java.util.Scanner;

public class xyz{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Product[] product = new Product[5];

        for (int i=0 ;i<=5 ;i++){
            System.out.println("Enter Product " + (i+1) + " Details");

            int pid = sc.nextInt();
            System.out.println("PID :");

            int price = sc.nextInt();
            System.out.println("Price :");

            int quantity = sc.nextInt();
            System.out.println("Quantity :");

            product[i]=new Product(pid ,price,quantity);
        }
        int maxPid= findMaxPid(product);
        System.out.println("pid of highest price product" + maxPid);

        double totalAmount = calculateTotalAmount(product);
        System.out.println("Total Amount :" + totalAmount);
    }

    private static double calculateTotalAmount(Product[] product) {
        double totalAmount = 0;

        for (Product product1 : product){
            totalAmount = product1.getprice() * product1.getquantity();
        }
        return totalAmount;
    }

    private static int findMaxPid(Product[] product) {
        int maxPid = -1;
        double maxprice = Double.MIN_VALUE;

        for (Product product1 : product){
            if (product1.getprice() > maxprice){
                maxprice = product1.getprice();
                maxPid=product1.getpid();
            }
        }
        return maxPid;

    }
}
