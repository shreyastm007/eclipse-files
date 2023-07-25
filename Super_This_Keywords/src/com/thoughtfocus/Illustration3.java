package com.thoughtfocus;

public class Illustration3 {
	// Illustration class
	public int value = 5;

	// print method
	public void print(Illustration3 ob) {
		System.out.println("ob.value = " + ob.value);
	}

	void invoke() {
		// print method is invoked by passing this as an argument
		print(this);
	}

}
