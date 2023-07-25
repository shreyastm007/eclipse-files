package com.thoughtfocus;

import java.util.Scanner;

public class DoWhile {
	public void doWhile() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value:");
		int j = sc.nextInt();

		do {
			System.out.println(j);
			j++;
		} while (j <= 10);
	}

}
