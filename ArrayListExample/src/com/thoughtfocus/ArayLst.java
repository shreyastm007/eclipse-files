package com.thoughtfocus;

import java.util.*;

public class ArayLst {

	public void example() {
		// ArrayList<String> list=new ArrayList<String>(); //Generic type

		// Creating an empty arraylist
		ArrayList list = new ArrayList(); //non-generic type

		// Adding object in arraylist
		list.add("Mango");
		list.add("Apple");
		list.add("Banana");
		list.add("Grapes");
		list.add(10);
		list.add(1000);
		list.add(1);
		list.add(51.2354);
		list.add(5, "Shreyas");

		// Printing the arraylist object
		System.out.println(list);

		// deletion
		System.out.println("The deleted element is:" + list.remove(0));
		System.out.println(list);

		// Searching:

		System.out.println(list.contains("Grapes"));
		System.out.println(list.contains("100"));

		System.out.println(list.isEmpty());
		System.out.println(list.size());
	

		// accessing
		System.out.println("Element:" + list.get(6));

		// returns -1 if element not found,returns position if element is found.
		System.out.println("Element is:" + list.indexOf(8));
		System.out.println("Element is:" + list.indexOf(1));

		// Iterate means to fetch the elements of the arraylist.
		// We can fetch elements using three different methods are as follows:
		// Using iterator() Method
		// Using forEach() Method
		// Using listIterator() Method

		System.out.println("Iteration:");
		list.forEach(n -> {
			System.out.println(n);
		});

	}
}
