package com.thoughtfocus;

public class Inherit2 extends Inherit1 {
	public int c;
	public int d;

	public void sub() {
		c = 20;
		d = 10;
		System.out.println("BaseClass:" + (c - d));
	}
}
