package com.thoughtfocus;

import java.util.Scanner;

public class Relational {

	public void operation() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();

		// == operator
		System.out.println(a == b);

		// != operator
		System.out.println(a != b);

		// > operator
		System.out.println(a > b);

		// < operator
		System.out.println(a < b);

		// >= operator
		System.out.println(a >= b);

		// <= operator
		System.out.println(a <= b);
	}
}
