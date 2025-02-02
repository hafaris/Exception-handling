package com.techademy.exception;

public class ExceptionDemo {
	 public static void main(String[] args) {
	        try {
	            // Null Pointer Exception Example
	            String str = null;
	            System.out.println("String length: " + str.length()); // This will throw NullPointerException
	            
	        } catch (NullPointerException e) {
	            System.out.println("Exception Caught: NullPointerException - Trying to access a null reference.");
	        } finally {
	            System.out.println("Finally Block Always Executes");
	        }

	        System.out.println("====================================================="); // Just for separation

	        try {
	            // Array Index Out of Bounds Exception Example
	            int[] arr = {1, 2, 3};
	            System.out.println("Array element: " + arr[5]); // This will throw ArrayIndexOutOfBoundsException
	            
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Exception Caught: ArrayIndexOutOfBoundsException - Invalid array index.");
	        } finally {
	            System.out.println("Finally Block Always Executes");
	        }

	        System.out.println("Program execution continues after exception handling...");
	    }
}
