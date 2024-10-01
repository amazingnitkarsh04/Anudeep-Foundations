package com.cricket;
/* 
 * .write a program in Java to create a Map Interface where we can store the cricketer name in it 
 * along with his scores and search for the batsman name and display his score.
 * */


	import java.util.HashMap;
	import java.util.Map;
	import java.util.Scanner;

	public class CricketScoreViyaMapinterface {
	    public static void main(String[] args) {
	        // Create a Map to store cricketer names and their scores
	        Map<String, Integer> cricketerScores = new HashMap<>();

	        // Adding cricketer names and their scores to the Map
	        cricketerScores.put("Sachin Tendulkar", 18426);
	        cricketerScores.put("Virat Kohli", 12345);
	        cricketerScores.put("Brian Lara", 10405);
	        cricketerScores.put("Ricky Ponting", 27483);
	        cricketerScores.put("Jacques Kallis", 13289);

	        // Displaying the cricketer scores
	        System.out.println("Cricketer Scores: " + cricketerScores);

	        // Create a Scanner object for user input
	        Scanner scanner = new Scanner(System.in);
	        
	        // Prompt user to enter the cricketer's name to search for
	        System.out.print("Enter the name of the cricketer to search for: ");
	        String cricketerName = scanner.nextLine();

	        // Search for the cricketer in the Map and display the score
	        Integer score = cricketerScores.get(cricketerName);
	        if (score != null) {
	            System.out.println(cricketerName + "'s score is: " + score);
	        } else {
	            System.out.println("Cricketer not found.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}



