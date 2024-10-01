package com.hashMap;
//.Write a Java program to associate the specified value with the specified key in a HashMap.


	import java.util.HashMap;

	public class HashMap1 {
	    public static void main(String[] args) {
	        // Create a HashMap to store Integer keys and String values
	        HashMap<Integer, String> map = new HashMap<>();

	        // Associate values with keys using put() method
	        map.put(1, "Apple");
	        map.put(2, "Banana");
	        map.put(3, "Cherry");

	        // Display the HashMap before adding a new key-value pair
	        System.out.println("HashMap before adding a new key-value pair: " + map);

	        // Associate a new value with a new key
	        map.put(4, "Date");

	        // Display the HashMap after adding the new key-value pair
	        System.out.println("HashMap after adding key 4 with value 'Date': " + map);
	    }
	}

	


