package com.training.day2;

public class Employee extends Person{
    private int empid;
    private double salary;

    public Employee(String name, int age,int empid,double salary){
        super(name, age);
        this.empid = empid;
        this.salary = salary;
        System.out.println(name + " "+age + " "+empid + " "+salary);
    }
    public static void main(String[] args) {
        Employee obj = new Employee("ram",21,12,23000);


    }
}
