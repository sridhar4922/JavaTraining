package com.training.day4;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class StudentGrade {
    public static Map<String , Integer> studentGrade= new HashMap<>();

    public static void addStudent(String name,int grade){
        studentGrade.put(name,grade);
        System.out.println("Student "+ name + "with "+grade);
    }

    public static void removeStudent(String name){
        if(studentGrade.containsKey(name)){
            studentGrade.remove(name);
            System.out.println("Removed "+name + "this student");
        }else{
            System.out.println(name+" not found");
        }

    }

    public static void displayStudent(String name){
        if(studentGrade.containsKey(name)){
        int grade = studentGrade.get(name);
        System.out.println("grade of "+name+"is"+grade);
    }else{
            System.out.println(name+"not found");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        addStudent("john",90);
        addStudent("kishore",99);

        System.out.println("Enter the name of student:");
        String studentName = sc.nextLine();

        displayStudent(studentName);

        System.out.println("Enter student name to remove:");
        String studentRemove = sc.nextLine();

        removeStudent(studentRemove);

        sc.close();
    }
}


/*
OUTPUT

Student johnwith 90
Student kishorewith 99
Enter the name of student:
ram
ramnot found
Enter student name to remove:
john
Removed johnthis student
 */