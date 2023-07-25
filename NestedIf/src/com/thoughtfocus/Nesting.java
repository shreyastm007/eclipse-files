package com.thoughtfocus;

import java.util.Scanner;

public class Nesting {
	public void nesting() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the age:");
		int age = sc.nextInt();

		if (age >= 18) {
			System.out.println("Enter the weight:");
			int weight = sc.nextInt();

			if (weight > 50) {
				System.out.println("You are eligible to donate blood");
			} else {
				System.out.println("You are not eligible to donate blood");
			}
		} else {
			System.out.println("Age must be greater than 18");
		}
	}
}
