package com.thoughtfocus;

public class Assignment {

	public void operation() {

		// create variables
		int a = 4;
		int var;

		var = a;
		System.out.println("var using =: " + var);

		var += a;// var=var+a
		System.out.println("var using +=: " + var);

		var -= a;// var=var-a
		System.out.println("var using -=: " + var);

		var *= a; // var=var*a
		System.out.println("var using *=: " + var);

		var /= a; // var=var/a
		System.out.println("var using /=: " + var);

		var %= a; // var=var%a
		System.out.println("var using %=: " + var);
	}
}
