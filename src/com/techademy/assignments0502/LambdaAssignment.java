package com.techademy.assignments0502;

import java.util.ArrayList;
import java.util.List;

// Functional interface
@FunctionalInterface
interface StringProcessor {
    String process(String str);
}

public class LambdaAssignment {
    public static void main(String[] args) {
        // Step 1: Create a list of strings
        List<String> words = new ArrayList<>();
        words.add("apple");
        words.add("banana");
        words.add("cherry");
        words.add("date");
        words.add("elderberry");

        // Step 2: Sort the list in reverse alphabetical order using a lambda expression
        words.sort((s1, s2) -> s2.compareTo(s1));
        System.out.println("Sorted List (Reverse Alphabetical Order): " + words);

        // Step 3: Implement the StringProcessor functional interface using a lambda expression
        StringProcessor toUpperCaseProcessor = String::toUpperCase;

        // Step 4: Process the list of strings and print their uppercase forms
        System.out.println("Uppercase Strings:");
        for (String word : words) {
            System.out.println(toUpperCaseProcessor.process(word));
        }
    }
}

