package com.thoughtfocus;

public class Logical {

	public void operation() {

		// && operator
		System.out.println((5 > 3) && (8 > 5));
		System.out.println((5 > 3) && (8 < 5));
		System.out.println((5 < 3) && (8 < 5));

		// || operator
		System.out.println((5 < 3) || (8 > 5));
		System.out.println((5 > 3) || (8 > 5));
		System.out.println((5 < 3) || (8 < 5));

		// ! operator
		System.out.println(!(5 == 3));
		System.out.println(!(5 > 3));

	}
}