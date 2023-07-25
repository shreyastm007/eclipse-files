package com.thoughtfocus;

final class Keywords {
	// Methods cannot be extended to its sub class
}

class Books extends Keywords {
	void show() {
		System.out.println("Book-Class method");
	}

}
