package com.thoughtfocus;

import java.util.Stack;
import java.util.Iterator;

public class StackDemo {
	public void stackExample() {

		// Creating an empty Stack
		Stack<String> stack = new Stack<String>();//generic type

		// Use push() to add elements into the Stack
		stack.push("Welcome");
		stack.push("To");
		stack.push("Geeks");
		stack.push("For");
		stack.push("Geeks");

		// Displaying the Stack
		System.out.println("Initial Stack: " + stack);

		// Fetching the element at the head of the Stack
		System.out.println("The element at the top of the stack is:" + stack.peek());

		// deletion
		System.out.println("The deleted element is:" + stack.pop());
		System.out.println(stack);

		// Searching:
		// It returns the position of the element from the stack. Else, it
		// returns -1.
		System.out.println(stack.search("Shreyas"));
		System.out.println(stack.search("For"));

		System.out.println(stack.empty());
		System.out.println(stack.size());

		// Iterate means to fetch the elements of the stack.
		// We can fetch elements of the stack using three different methods are as
		// follows:
		// Using iterator() Method
		// Using forEach() Method
		// Using listIterator() Method

		System.out.println("Iteration:");
		stack.forEach(n -> {
			System.out.println(n);
		});

	}
}
