package com.treemap;


	import java.util.TreeMap;

	public class TreeMapExample {
	    public static void main(String[] args) {
	        // Create a TreeMap to store String keys and Integer values
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Add entries to the TreeMap
	        treeMap.put("One", 1);
	        treeMap.put("Two", 2);
	        treeMap.put("Three", 3);

	        // Display the original TreeMap
	        System.out.println("Original TreeMap: " + treeMap);

	        // Specify the key to remove
	        String keyToRemove = "Two";

	        // Remove the entry associated with the specified key
	        Integer removedValue = treeMap.remove(keyToRemove);

	        // Display the removed value
	        System.out.println("Removed value = " + removedValue);

	        // Check if a specific entry is removed
	        boolean isEntryRemoved = !treeMap.containsKey("Three");
	        System.out.println("Is the entry {Three=3} removed? " + isEntryRemoved);

	        // Display the updated TreeMap
	        System.out.println("Updated TreeMap: " + treeMap);
	    }
	}


