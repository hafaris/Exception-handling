package com.techademy.list;

import java.util.*;

public class ArrayListEx {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");
        list.add("Banana"); // Duplicates allowed

        System.out.println(list); // [Apple, Banana, Cherry, Banana]
        System.out.println(list.get(1)); // Banana (Access via index)
        
        list.remove("Banana"); // Removes first occurrence
        System.out.println(list); // [Apple, Cherry, Banana]
    }
}

