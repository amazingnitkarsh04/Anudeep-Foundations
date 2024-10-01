package com.treemapmethod;

//Navigate over the elements of the treemap.(All methods)

	import java.util.TreeMap;
	import java.util.Map;

	public class TreeMapNavigation {
	    public static void main(String[] args) {
	        // Create a TreeMap to store String keys and Integer values
	        TreeMap<String, Integer> treeMap = new TreeMap<>();

	        // Adding entries to the TreeMap
	        treeMap.put("One", 1);
	        treeMap.put("Two", 2);
	        treeMap.put("Three", 3);
	        treeMap.put("Four", 4);
	        treeMap.put("Five", 5);

	        // Display the original TreeMap
	        System.out.println("Original TreeMap: " + treeMap);

	        // 1. Navigating using for-each loop on entrySet()
	        System.out.println("\nUsing entrySet() to iterate over key-value pairs:");
	        for (Map.Entry<String, Integer> entry : treeMap.entrySet()) {
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }

	        // 2. Navigating using for-each loop on keySet()
	        System.out.println("\nUsing keySet() to iterate over keys:");
	        for (String key : treeMap.keySet()) {
	            System.out.println("Key: " + key + ", Value: " + treeMap.get(key));
	        }

	        // 3. Navigating using for-each loop on values()
	        System.out.println("\nUsing values() to iterate over values:");
	        for (Integer value : treeMap.values()) {
	            System.out.println("Value: " + value);
	        }

	        // 4. Navigating using Iterator (entrySet)
	        System.out.println("\nUsing Iterator to navigate through entrySet:");
	        var iterator = treeMap.entrySet().iterator();
	        while (iterator.hasNext()) {
	            Map.Entry<String, Integer> entry = iterator.next();
	            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
	        }
	    }
	}



