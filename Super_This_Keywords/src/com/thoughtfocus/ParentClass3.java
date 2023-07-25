package com.thoughtfocus;

public class ParentClass3 {
	// declaring parent class

	ParentClass3() {
		System.out.println("Parent class no argument constructor");
	}

	ParentClass3(String s) {
		System.out.println("Parent class parameterized " + s);
	}
}

// Child class extends parent class
class Child3 extends ParentClass3 {

	Child3() {
		// referring current class parameterized constructor
		this("constructor");
		System.out.println("Child class no-argument constructor.");
	}

	Child3(String s) {
		// referring parent class parameterized constructor
		super("constructor");
		System.out.println("Child class parameterized " + s);
	}
}
