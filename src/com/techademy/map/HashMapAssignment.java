package com.techademy.map;
import java.util.*;

public class HashMapAssignment {
	
	    public static void main(String[] args) {
	        HashMap<Integer, String> studentMap = new HashMap<>();

	        studentMap.put(101, "Deepak");
	        studentMap.put(102, "Ramesh");
	        studentMap.put(103, "Suresh");
	        studentMap.put(104, "Sanju");
	        studentMap.put(105, "Tilak");

	        System.out.println("Initial Student Records: " + studentMap);

	        int rollNumberToFind = 103;
	        if (studentMap.containsKey(rollNumberToFind)) {
	            System.out.println("Student with Roll No " + rollNumberToFind + ": " + studentMap.get(rollNumberToFind));
	        } else {
	            System.out.println("Roll Number " + rollNumberToFind + " not found.");
	        }

	        
	        studentMap.remove(104);
	        System.out.println("After Removing Roll No : " + studentMap);

	        System.out.println("Final Student Records:");
	        for (Map.Entry<Integer, String> entry : studentMap.entrySet()) {
	            System.out.println("Roll No: " + entry.getKey() + ", Name: " + entry.getValue());
	        }
	    }
	

}
