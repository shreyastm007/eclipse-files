package com.thoughtfocus;

import java.util.Scanner;

public class Arithmetic {

	public void operation() {

		// declare variables
		// int a = 12, b = 6;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of a:");
		int a = sc.nextInt();
		System.out.println("Enter the value of b:");
		int b = sc.nextInt();

		// addition operator
		System.out.println("a + b = " + (a + b));

		// subtraction operator
		System.out.println("a - b = " + (a - b));

		// multiplication operator
		System.out.println("a * b = " + (a * b));

		// division operator
		System.out.println("a / b = " + (a / b));

		// modulo operator
		System.out.println("a % b = " + (a % b));

	}
}
