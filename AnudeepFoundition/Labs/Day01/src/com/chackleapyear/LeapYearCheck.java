package com.chackleapyear;

// program for Cheak leap year...
	import java.util.Scanner;

	public class LeapYearCheck {
	    public static void main(String[] args) {
	        // a Scanner object to read input from the user
	        Scanner scanner = new Scanner(System.in);

	        // user for input
	        System.out.print("Enter a year: ");
	        int year = scanner.nextInt();

	        //  if the year is a leap year
	        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
	            System.out.println(year + " is a leap year.");
	        } else {
	            System.out.println(year + " is not a leap year.");
	        }

	        // Close the scanner
	        scanner.close();
	    }
	}

