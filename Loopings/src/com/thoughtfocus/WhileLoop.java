package com.thoughtfocus;

import java.util.Scanner;

public class WhileLoop {
	public void whileLoop() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int j = sc.nextInt();

		while (j <= 10) {
			System.out.println(j);
			j++;
		}
	}
}
