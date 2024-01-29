package com.training.day3;

import java.util.Scanner;

public class xyz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Employee Information:");
        System.out.print("Employee ID: ");
        int empId = scanner.nextInt();
        System.out.print("Employee Name: ");
        String empName = scanner.next();
        System.out.print("Salary: $");
        double empSalary = scanner.nextDouble();

        Employee employee = new Employee(empId, empName, empSalary);


        System.out.println("\nCalculating Income Tax:");
        employee.calTax();


        System.out.println("\nEnter Product Information:");
        System.out.print("Product ID: ");
        int productId = scanner.nextInt();
        System.out.print("Price per unit: $");
        double productPrice = scanner.nextDouble();
        System.out.print("Quantity: ");
        int productQuantity = scanner.nextInt();


        Product product = new Product(productId, productPrice, productQuantity);


        System.out.println("\nCalculating Sales Tax:");
        product.calTax();

        scanner.close();
    }
}
