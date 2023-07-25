package com.thoughtfocus;

public class Exception1 {
	public void checkAge(int age) {
		if (age < 18) {
			throw new ArithmeticException("access denied");
		} else {
			System.out.println("access granted");
		}
	}

}
