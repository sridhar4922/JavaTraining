package com.training.day5;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonEmptyStrings {
    public static void main(String[] args) {
        List<String> strings = Arrays.asList("abc", "" , "bc", "efg", "abed" ,"", "jkl");
        List<String> nonEmptyStrings = strings.stream()
                .filter(s -> !s.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Original List "+ strings);
        System.out.println("Non Empty List " +nonEmptyStrings );

    }
}

/*
OUTPUT

Original List [abc, , bc, efg, abed, , jkl]
Non Empty List [abc, bc, efg, abed, jkl]
 */
