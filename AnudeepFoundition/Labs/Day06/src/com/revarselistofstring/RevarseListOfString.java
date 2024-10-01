package com.revarselistofstring;


	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.List;

	public class RevarseListOfString {
	    public static void main(String[] args) {
	        // Create an ArrayList to store strings
	        List<String> stringList = new ArrayList<>();

	        // Add some strings to the list
	        stringList.add("Apple");
	        stringList.add("Banana");
	        stringList.add("Cherry");
	        stringList.add("Date");
	        stringList.add("Elderberry");

	        // Display the original list
	        System.out.println("Original List: " + stringList);

	        // Reverse the list using Collections.reverse()
	        Collections.reverse(stringList);

	        // Display the reversed list
	        System.out.println("Reversed List: " + stringList);
	    }
	}



