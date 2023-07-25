package com.thoughtfocus;

public class OverLoading {
	public int multiply(int a, int b) {
		System.out.println(a * b);
		return a * b;

	}

	public int multiply(int a, int b, int c) {
		System.out.println(a * b * c);
		return a * b * c;
	}
}
