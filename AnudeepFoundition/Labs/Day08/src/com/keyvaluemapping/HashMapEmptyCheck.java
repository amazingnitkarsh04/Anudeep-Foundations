package com.keyvaluemapping;
//2.Write a Java program to check whether a HashMap contains key-value mappings (empty) or not.

	import java.util.HashMap;

	public class HashMapEmptyCheck {
	    public static void main(String[] args) {
	        // Create a HashMap to store Integer keys and String values
	        HashMap<Integer, String> map = new HashMap<>();

	        // Check if the HashMap is empty
	        if (map.isEmpty()) {
	            System.out.println("The HashMap is empty.");
	        } else {
	            System.out.println("The HashMap contains key-value mappings.");
	        }

	        // Add some key-value mappings to the HashMap
	        map.put(1, "Apple");
	        map.put(2, "Banana");

	        // Check again if the HashMap is empty or not after adding key-value pairs
	        if (map.isEmpty()) {
	            System.out.println("The HashMap is empty.");
	        } else {
	            System.out.println("The HashMap contains key-value mappings.");
	        }
	    }
	}

	


