package com.thoughtfocus;

public class Conversion {
	public void example1() {
		// int to float--->implicit conversion
		int a = 50;
		float b = a;
		System.out.println(b);
	}

	public void example2() {
		// double to float--->explicit conversion
		double a = 50.025488461535;
		float b = (float) a;
		System.out.println(b);

	}

	public void example3() {
		// char to string
		char a = 'v';
		String b = Character.toString(a);
		System.out.println(b);
	}

	public void example4() {
		// int to string
		int a = 45;
		String b = Integer.toString(a);
		System.out.println(b);
	}

	public void example5() {
		// string to int
		String a = "200";
		int b = Integer.parseInt(a);
		System.out.println(b);
	}

	public void example6() {
		// string to char
		String a = "shreyas";
		for (int i = 0; i < a.length(); i++) {
			char b = a.charAt(i);
			System.out.println(b);
		}
	}

	public void example7() {
		// string to char
		String a = "v";
		char b = a.charAt(0);

		System.out.println(b);

	}
}
