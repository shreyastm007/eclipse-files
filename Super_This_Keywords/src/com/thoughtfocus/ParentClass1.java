
package com.thoughtfocus;

//parent class
class ParentClass1 {

	void display() {
		System.out.println("Hi I am parent method.");
	}
}

//child class extending parent class
class ChildClass extends ParentClass1 {

// declaring display method in Child class
	void display() {
		System.out.println("Hi I am child method.");
	}

	void print() {
		// invoking display method from parent class
		super.display();
		// display method from child class
		display();
	}
}
