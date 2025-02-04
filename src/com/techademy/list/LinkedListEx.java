package com.techademy.list;

import java.util.*;

public class LinkedListEx {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(1, 15); // Insert at index 1
        
        System.out.println(list); // [10, 15, 20, 30]
        
        list.remove(2); // Removes element at index 2 (20)
        System.out.println(list); // [10, 15, 30]
    }
}
