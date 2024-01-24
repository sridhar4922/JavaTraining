package com.training.day1;

import java.util.Scanner;

public class taskone {

    public void printNumber() {
        int i = 10;
        for (i = 10; i <= 50; i++) {
            System.out.println(i);
        }
    }

    public void positiveOrNegative() {
        Scanner number = new Scanner(System.in);
        System.out.println("Enter Number to find positive or negative");
        int num = number.nextInt();


        if (num > 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }

    public void reverse() {
        System.out.println("Reverse the Number");
        int rev = 876;
        int revnum = 0;

        while (rev != 0) {
            int digit = rev % 10;
            revnum = revnum * 10 + digit;
            rev /= 10;

        }
        System.out.println(revnum);
    }

    public void smallestNumber(){
        Scanner smallnumber = new Scanner(System.in);
        System.out.println("Find Smallest of 3 Numbers");

        System.out.println("Enter 1st Number :");
        int num1 = smallnumber.nextInt();

        System.out.println("Enter 2nd Number :");
        int num2 = smallnumber.nextInt();

        System.out.println("Enter 3rd Number :");
        int num3 = smallnumber.nextInt();

        if(num1 < num2 && num1< num3){
            System.out.println("Smallest Number is :" + num1);
        }
        else if (num2 < num1 && num2 < num3) {
            System.out.println("Smallest Number is :" + num2);
        }
        else{
            System.out.println("Smallest Number is :" + num3);
        }


    }

    public void purchase(){

        Scanner price = new Scanner(System.in);
        System.out.println("Final Payable Amount");

        System.out.println("Enter Amount :");
        int amount  = price.nextInt();

        if(amount < 500){
            System.out.println("No Discount ");
        } else if (amount > 500 && amount < 1000 ) {
            amount /= 10;
            System.out.println("10 percent Discount applied : " + amount);
        }
        else{
            amount /= 20;
            System.out.println("20 percent Discount applied :" + amount);
        }

    }

    public void pattern(){
        for(int i = 5; i >= 1; i--){
            for(int j = 5; j >= 1 ;j--) {
                if (j >= i) {
                    System.out.println(j);
                }
                else
                 {
                    System.out.println(i);
                }
            }
            System.out.println();
        }
    }

        public static void main (String[]args){
            taskone object = new taskone();
            object.printNumber();
            System.out.println("__________________________________________________________");

            taskone object1 = new taskone();
            object1.positiveOrNegative();
            System.out.println("__________________________________________________________");

            taskone object2 = new taskone();
            object2.reverse();
            System.out.println("__________________________________________________________");

            taskone object3 = new taskone();
            object3.smallestNumber();
            System.out.println("__________________________________________________________");

            taskone object4 = new taskone();
            object4.purchase();
            System.out.println("__________________________________________________________");

            taskone object5 = new taskone();
            object5.pattern();
            System.out.println("__________________________________________________________");

        }
}
