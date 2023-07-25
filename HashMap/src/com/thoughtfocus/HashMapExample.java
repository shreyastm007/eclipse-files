package com.thoughtfocus;

import java.util.*;

public class HashMapExample {
	public void example() {

		//generic type
		HashMap<Integer, String> map = new HashMap<Integer, String>();// Creating HashMap
		map.put(1, "Mango"); // insert elements in Map
		map.put(2, "Apple");
		map.put(3, "Banana");
		map.put(4, "Grapes");
		map.put(1, "Orange"); // duplicate key

		System.out.println(map);

		map.putIfAbsent(103, "Gaurav");// adding elements
		map.put(104, "Ravi");
		System.out.println("After adding elements:" + map);

		System.out.println(map.containsKey(4));
		System.out.println(map.containsValue("Apple"));
		System.out.println(map.containsValue("Kiwi"));

		System.out.println(map.entrySet());
		System.out.println(map.get(4));

		System.out.println(map.isEmpty());
		System.out.println("Size of map is:" + map.size());
		System.out.println("The value of hashmap are;" + map.values());

		// key-based removal
		map.remove(103);
		// key-value pair based removal
		map.remove(104, "Ravi");
		System.out.println("Hashmap after deletion:" + map);

		// updating elements
		map.replace(3, "Mango");
		map.replace(4, "Grapes", "Banana");
		System.out.println("Hashmap after updation:" + map);

		System.out.println("Iterating Hashmap...");
		// System.out.println(map.entrySet());
		for (Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey() + " " + m.getValue());
		}
	}
}
