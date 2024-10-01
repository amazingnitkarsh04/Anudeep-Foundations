package com.arrayindexoutofbound;
// arrayout of bound demo
public class ArrayOutOfBound {

	    public static void main(String[] args) {
	        // Create an array of integers with 5 elements
	        int[] numbers = {10, 20, 30, 40, 50};

	        try {
	            // Loop through the array beyond its length to trigger ArrayIndexOutOfBoundsException
	            for (int i = 0; i <= numbers.length; i++) {
	                // Attempt to access each element, including the out-of-bounds index
	                System.out.println("Element at index " + i + ": " + numbers[i]);
	            }
	        } catch (ArrayIndexOutOfBoundsException e) {
	            // Handle the exception and print a custom error message
	            System.out.println("ArrayIndexOutOfBoundsException caught!");
	            System.out.println("Tried to access an invalid index: " + e.getMessage());
	        }
	    }
	}


