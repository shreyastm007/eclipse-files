package com.thoughtfocus;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {
	public void queueExample() {

		// Creating an empty Queue
		// Queue<Integer> queue = new LinkedList<Integer>(); //generic type
		Queue queue = new LinkedList();// non-generic type

		// to add elements into the Queue
		queue.add(1);
		queue.add(2.5);
		queue.add(3);
		queue.add("2");
		queue.add("shreyas");

		// Displaying the queue
		System.out.println("Initial queue: " + queue);

		// Fetching the element at the head of the queue
		System.out.println("The element at the top of the queue is:" + queue.peek());

		// deletion
		System.out.println("The deleted element is:" + queue.remove());
		System.out.println(queue);

		// Searching:

		System.out.println(queue.contains(5));
		System.out.println(queue.contains(2));

		System.out.println(queue.isEmpty());
		System.out.println(queue.size());

		System.out.println("element added:" + queue.offer(4));
		System.out.println("new queue: " + queue);
		System.out.println("The element at the top of the queue is:" + queue.element());// returns top element
		System.out.println("Deleted element is:" + queue.poll());

		// Iterate means to fetch the elements of the queue.
		// We can fetch elements using three different methods are as follows:
		// Using iterator() Method
		// Using forEach() Method
		// Using listIterator() Method

		System.out.println("Iteration:");
		queue.forEach(n -> {
			System.out.println(n);
		});

	}
}
