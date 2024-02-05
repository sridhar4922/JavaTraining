package com.training.day5;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your DOB as YYYY-MM-DD :");
        String Birthday = sc.nextLine();

        LocalDate birthday = LocalDate.parse(Birthday);

        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthday, currentDate);

        System.out.println("Your age is: " +
                age.getYears() + " years, " +
                age.getMonths() + " months, and " +
                age.getDays() + " days.");

        sc.close();
    }
}

/*
OUTPUT:

Enter your DOB as YYYY-MM-DD :
2002-09-04
Your age is: 21 years, 5 months, and 1 days.
 */