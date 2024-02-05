package com.training.day4;

class AgeNotWithinRange extends Exception{
    public AgeNotWithinRange(String message){
        super (message);
    }
}
class NameNotValidException extends Exception {
    public NameNotValidException (String message){
        super(message);
    }
}

class Student {
    private int rollno;
    private String name;
    private int age;
    private String course;

public Student (int rollno , String name, int age, String course) throws AgeNotWithinRange, NameNotValidException {
    this.rollno = rollno;
    this.name = name;
    this.age = age;
    this.course = course;

    if (age < 15 || age > 21) {
        throw new AgeNotWithinRange("Age Should be between 15 to 25");
    }
    if (!isValidName(name)) {
        throw new NameNotValidException("Name must contain numbers or special characters");
    }
}
    private boolean isValidName (String name){
        return name.matches("[Aa -Zz] + $");
    }
}


public class StudentMain{
public static void main(String[] args) {
    try{
        Student validStudent = new Student(1,"ram",12,"CSE");
    }catch (AgeNotWithinRange | NameNotValidException e){
        System.out.println("Exception "+ e.getMessage());

    }
}
}

/*
Output
if name is only letters:
Exception Name must contain numbers or special characters

if age below desiredvalue the o/p is:
Exception Age Should be between 15 to 25.


 */