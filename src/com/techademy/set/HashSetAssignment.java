package com.techademy.set;

import java.util.*;

public class HashSetAssignment {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();

        cities.add("Bangalore");
        cities.add("Delhi");
        cities.add("Bangalore");
        cities.add("Mumbai");
        cities.add("Kochi"); 

        System.out.println("Cities in the HashSet: " + cities);

        String cityToCheck = "Delhi";
        if (cities.contains(cityToCheck)) {
            System.out.println(cityToCheck + " exists in the HashSet.");
        } else {
            System.out.println(cityToCheck + " does not exist in the HashSet.");
        }

        cities.remove("Mumbai");
        System.out.println("After removing : " + cities);
    }
}
