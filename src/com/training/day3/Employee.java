package com.training.day3;

public class Employee implements Taxable{
    private int empId;
    private String name;
    private double salary;

    public Employee(int empId, String name, double salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public void calTax() {
        double incomeTaxAmount = salary * incomeTax;
        System.out.println("Income Tax for employee " + name + " with empId " + empId + ": $" + incomeTaxAmount);

    }
}

/*
Output:
Enter Employee Information:
Employee ID: 12
Employee Name: Ram
Salary: $20000

Calculating Income Tax:
Income Tax for employee Ram with empId 12: $2100.0

Enter Product Information:
Product ID: 10
Price per unit: $200
Quantity: 400

Calculating Sales Tax:
Sales Tax for product with pid 10: $5600.000000000001

Process finished with exit code 0

 */