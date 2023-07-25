package com.thoughtfocus;

public class Illustration1 {
	int a;

	// simple constructor
	public Illustration1() {
		// invoking parameterized constructor
		this(10);
	}

	// parameterized constructor
	public Illustration1(int x) {
		a = x;
		System.out.println("parameterized constructor invoked.");
		System.out.println("Value of a is: " + a);
	}
}
