package com.training.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpecialGifts {
    public static void main(String[] args) {
        List<String > StudentNames = Arrays.asList("Anitha","Barath","Charu","Andy","Arun","Ani","Deva","Dhruv","Abhi","Sri");
        List<String> StudentNameWithA = StudentNames.stream()
                .filter(name -> name.startsWith("A"))
                .collect(Collectors.toList());

        System.out.println("Students Names "+ StudentNames);
        System.out.println("Student Names With A "+ StudentNameWithA);
    }
}

/*
OUTPUT

Students Names [Anitha, Barath, Charu, Andy, Arun, Ani, Deva, Dhruv, Abhi, Sri]
Student Names With A [Anitha, Andy, Arun, Ani, Abhi]
 */