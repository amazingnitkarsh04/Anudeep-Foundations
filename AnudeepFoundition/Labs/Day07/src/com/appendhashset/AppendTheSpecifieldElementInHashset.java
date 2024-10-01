package com.appendhashset;


	import java.util.HashSet;

	public class  AppendTheSpecifieldElementInHashset  {
	    public static void main(String[] args) {
	        // Create a HashSet to store String elements
	        HashSet<String> fruits = new HashSet<>();

	        // Add some initial elements to the HashSet
	        fruits.add("Apple");
	        fruits.add("Banana");
	        fruits.add("Cherry");

	        // Display the HashSet before adding a new element
	        System.out.println("HashSet before adding: " + fruits);

	        // Add a new element to the HashSet
	        fruits.add("Date");

	        // Display the HashSet after adding the new element
	        System.out.println("HashSet after adding 'Date': " + fruits);
	    }
	}



