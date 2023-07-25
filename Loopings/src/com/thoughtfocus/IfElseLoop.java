package com.thoughtfocus;

import java.util.Scanner;

public class IfElseLoop {
	public void gender() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the option:");
		int s = sc.nextInt();
		if (s == 1) {
			System.out.println("MALE");
		} else if (s == 2) {
			System.out.println("FEMALE");
		} else {
			System.out.println("OTHERS");
		}

	}

}
