package com.training.day5;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UpperCase {
    public static void main(String[] args) {
        Stream<String> names = Stream.of("aBc", "d", "ef");
        List <String> uppercasenames = names.map(String::toUpperCase).collect(Collectors.toList());

        System.out.println("Original List " + Stream.of("aBc", "d", "ef").collect(Collectors.toList()));
        System.out.println("Updated List "+ uppercasenames);
    }
}

/*
OUTPUT


Original List [aBc, d, ef]
Updated List [ABC, D, EF]
 */