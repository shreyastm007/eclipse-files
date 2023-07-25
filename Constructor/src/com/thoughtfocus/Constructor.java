package com.thoughtfocus;

public class Constructor {

	public int id;
	public String name;
	public int age;

	public Constructor(String a, int b) {
		name = a;
		id = b;
		System.out.println(name);
		System.out.println(id);
	}

	public Constructor(String a, int b, int c) {
		name = a;
		id = b;
		age = c;
		System.out.println(name);
		System.out.println(id);
		System.out.println(age);
	}
}
