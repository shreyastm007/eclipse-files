
package com.thoughtfocus;

import java.util.PriorityQueue;

public class PQueue {

	public void priorityQueue() {

		// Creating a priority queue
		PriorityQueue<Integer> numbers = new PriorityQueue<>();//generic type
		numbers.add(4);
		numbers.add(2);
		numbers.add(1); 
		numbers.add(7);
		numbers.add(9);
		numbers.add(8);
		numbers.add(6);
		numbers.add(3);

		// Displaying the priority queue
		System.out.println("PriorityQueue: " + numbers);

		// Fetching the element at the head of priority queue
		System.out.println("The element at the top of the  priority queue is:" + numbers.peek());

		// deletion
		System.out.println("The deleted element is:" + numbers.remove());
		System.out.println(numbers);

		// Searching:

		System.out.println(numbers.contains(2));
		System.out.println(numbers.contains(22));

		System.out.println(numbers.isEmpty());
		System.out.println(numbers.size());

		System.out.println("Element added:" + numbers.offer(122));
		System.out.println("Element added:" + numbers.offer(1));
		System.out.println(" New PriorityQueue: " + numbers);
		System.out.println("Deleted element is:" + numbers.poll());// deletes element at top of queue.

		// Iterate means to fetch the elements of the priority queue.
		// We can fetch elements using three different methods are as follows:
		// Using iterator() Method
		// Using forEach() Method
		// Using listIterator() Method

		System.out.println("Iteration:");
		numbers.forEach(n -> {
			System.out.println(n);
		});

	}
}
