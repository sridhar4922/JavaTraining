package com.training.day2;

 public class Person {

     private int age;
     private String name;

     void Detail() {
         System.out.println("The 1st method is printing");
     }

     public Person() {
         this.age = 18;
     }
     public Person (String name , int age){
         this.name = name;
         this.age = age;

     }

     public void Detail(String name, int age) {
         this.name = name;
         this.age = age;
         System.out.println(name + age);
     }
 }

