package com.arraylistsumallevennumbers;


	import java.util.ArrayList;

	public class SumOfAllEvenNumberPresentNumber {
	    public static void main(String[] args) {
	        // Create an ArrayList to store integers
	        ArrayList<Integer> numbers = new ArrayList<>();

	        // Add some integers to the list
	        numbers.add(10);
	        numbers.add(21);
	        numbers.add(32);
	        numbers.add(43);
	        numbers.add(54);
	        numbers.add(65);

	        // Variable to store the sum of even numbers
	        int sumOfEven = 0;

	        // Iterate over the ArrayList using enhanced for loop
	        for (int num : numbers) {
	            // Check if the number is even
	            if (num % 2 == 0) {
	                sumOfEven += num; // Add the even number to the sum
	            }
	        }

	        // Display the sum of even numbers
	        System.out.println("The sum of even numbers in the list is: " + sumOfEven);
	    }
	}



