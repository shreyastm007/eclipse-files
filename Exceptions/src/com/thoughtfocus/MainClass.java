package com.thoughtfocus;

public class MainClass {

	public static void main(String[] args) {
		Exception exceptions = new Exception();
		exceptions.throwException();

		Exception1 exception = new Exception1();
		Exception2 ex = new Exception2();
		exception.checkAge(25);
		ex.checkAge(21);
		ex.checkAge(17);
		//exception.checkAge(15);
		

	}

}
