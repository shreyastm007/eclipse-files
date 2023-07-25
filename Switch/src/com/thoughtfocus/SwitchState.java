package com.thoughtfocus;

import java.util.Scanner;

public class SwitchState {
	public void example() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int n = sc.nextInt();

		switch (n) {

		case 1:

			System.out.println("hai");
			break;

		case 2:

			System.out.println("hello");
			break;

		default:
			System.out.println("bye");

		}
	}

}
