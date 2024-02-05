package com.training.day4;

import java.util.Scanner;

public class WeekDay {
    public static void main(String[] args) {
        String[] WeekDays = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday" };
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter day position [0 - 6] :");

        try {
            int dayIndexPosition = sc.nextInt();

            if (dayIndexPosition >= 0 && dayIndexPosition < WeekDays.length){
                System.out.println("This is "+WeekDays[dayIndexPosition]);
            }else{
                System.out.println("Enter value between 0 - 6");
            }

        }catch (Exception e){
            System.out.println("Invalid input enter valid input");
        }
        finally {
            sc.close();
        }
    }
}

/*
OUTPUT

Enter day position [0 - 6] :
1
This is Monday
 */