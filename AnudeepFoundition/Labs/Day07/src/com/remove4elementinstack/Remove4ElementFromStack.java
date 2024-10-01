package com.remove4elementinstack;


	import java.util.Stack;

	public class Remove4ElementFromStack {
	    public static void main(String[] args) {
	        // Declare a Stack of Integer type
	        Stack<Integer> stack = new Stack<>();

	        // Push 10 elements into the stack
	        for (int i = 1; i <= 10; i++) {
	            stack.push(i);  // Adding elements 1 to 10
	        }

	        // Display the stack after pushing 10 elements
	        System.out.println("Stack after pushing 10 elements: " + stack);

	        // Remove (pop) 4 elements from the stack
	        for (int i = 0; i < 4; i++) {
	            stack.pop();  // Removes the top element of the stack
	        }

	        // Display the stack after removing 4 elements
	        System.out.println("Stack after removing 4 elements: " + stack);
	    }
	}



