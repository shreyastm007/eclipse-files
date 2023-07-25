package com.thoughtfocus;

public class ParentClass2 {
	// parent class
	// parent class constructor
	ParentClass2() {
		System.out.println("Hi I am Parent class constructor.");
	}
}

// child class extending parent class
class Child1 extends ParentClass2 {

	// child class constructor
	Child1() {
		
		super(); // invoking parent class constructor
	}

}
