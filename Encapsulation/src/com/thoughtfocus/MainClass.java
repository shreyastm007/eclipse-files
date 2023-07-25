package com.thoughtfocus;

public class MainClass {

	public static void main(String[] args) {
		Encapsulation encapsulation = new Encapsulation();
		// set
		encapsulation.setId("10");
		encapsulation.setCity("Hassan");
		encapsulation.setName("shreyas");
		// get
		System.out.println("Id:" + encapsulation.getId());
		System.out.println("Name:" + encapsulation.getName());
		System.out.println("City:" + encapsulation.getCity());

	}

}
