package com.thoughtfocus;

import java.util.*;

public class DequeExample {

	public void operation() {
		// Creating Deque and adding elements
		
		// Deque<String> deque = new ArrayDeque<String>();  //Generic type

		ArrayDeque deque = new ArrayDeque();// non-generic
		deque.add("Gautam");
		deque.add("Karan");
		deque.add("Ajay");
		deque.add(10);
		deque.add(52.126);

		// Displaying the queue
		System.out.println("Initial queue: " + deque);

		// Fetching the element at the head of the queue
		System.out.println("The element at the top of the queue is:" + deque.peek());

		// deletion
		System.out.println("The deleted element is:" + deque.remove());
		System.out.println(deque);

		// Searching:

		System.out.println(deque.contains(5));
		System.out.println(deque.contains(10));

		System.out.println(deque.isEmpty());
		System.out.println(deque.size());

		System.out.println("element added:" + deque.offer(4));
		System.out.println("new queue: " + deque);
		System.out.println("The element at the top of the queue is:" + deque.element());// returns top element
		System.out.println("Deleted element is:" + deque.poll());

//Traversing elements
//for (String str : deque) {
//System.out.println(str);

		System.out.println("Iteration:");
		deque.forEach(n -> {
			System.out.println(n);
		});
	}
}
