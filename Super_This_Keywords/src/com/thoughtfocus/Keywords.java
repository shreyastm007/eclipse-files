package com.thoughtfocus;

public class Keywords {
	public int weight = 8;
}

class Clerk extends Keywords {
	public int weight = 10;

	void display() {
		System.out.println(this.weight);
		System.out.println(super.weight);
	}

}
