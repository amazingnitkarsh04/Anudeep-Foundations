package com.strongnumber;

//The task is to write a program that checks whether a number is a Strong number
	
	import java.util.Scanner;

	public class StrongNumber {
	    
	    // Method to calculate factorial of a number
	    public static int factorial(int n) {
	        int fact = 1;
	        for (int i = 1; i <= n; i++) {
	            fact *= i;
	        }
	        return fact;
	    }

	    // Method to check if a number is a Strong number
	    public static boolean isStrongNumber(int number) {
	        int originalNumber = number;
	        int sumOfFactorials = 0;

	        // Loop through each digit of the number
	        while (number > 0) {
	            int digit = number % 10; // Extract the last digit
	            sumOfFactorials += factorial(digit); // Add factorial of the digit
	            number /= 10; // Remove the last digit
	        }

	        // Check if the sum of factorials is equal to the original number
	        return sumOfFactorials == originalNumber;
	    }

	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a number: ");
	        int number = scanner.nextInt();

	        if (isStrongNumber(number)) {
	            System.out.println(number + " is a Strong number.");
	        } else {
	            System.out.println(number + " is not a Strong number.");
	        }

	        scanner.close();
	    }
	}
