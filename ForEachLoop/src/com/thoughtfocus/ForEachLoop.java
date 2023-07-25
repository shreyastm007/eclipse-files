package com.thoughtfocus;

public class ForEachLoop {

	public void loop() {
		int[] arr = { 12, 13, 14, 44 };
		int total = 0;
		for (int i : arr) {
			total = total + i;
		}
		System.out.println("Total: " + total);
	}
}