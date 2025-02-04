package com.techademy.list;

import java.util.ArrayList;

public class ArrayListAssignment {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        System.out.println("Original List: " + numbers);

        numbers.remove(2);
        System.out.println("After Removing 3rd Element: " + numbers);

        numbers.set(1, 25);
        System.out.println("After Updating 2nd Element: " + numbers);

        System.out.println("Final List Elements:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}

