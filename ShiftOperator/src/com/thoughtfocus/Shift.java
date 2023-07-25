package com.thoughtfocus;

public class Shift {

	public void leftShift() {

		int number1 = 2;
		int number2 = -2;

		// 2 bit left shift operation
		int result1 = number1 << 2;
		int result2 = number2 << 2;
		System.out.println(result1);// prints 8
		System.out.println(result2);// prints -8
	}

	public void signedRightShift() {

		int number1 = 8;
		int number2 = -8;

		// 2 bit signed right shift
		System.out.println(number1 >> 2); // prints 2
		System.out.println(number2 >> 2); // prints -2
	}

	public void unsignedRightShift() {

		int number1 = 8;
		int number2 = -8;

		System.out.println(number1 >>> 2); // prints 2
		System.out.println(number2 >>> 2); // prints 1073741822
	}
}
