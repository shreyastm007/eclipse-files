package com.thoughtfocus;

public class Exception {
	String[] names = new String[] { "shreyas", "avi", "vaibhav" };

	int a = 4;

	public void throwException() {
		try {
			System.out.println(names[0]);
			System.out.println(names[3]);

			System.out.println(a / 0);

		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("exception occured: out of range exception");
		} catch (NullPointerException e) {
			System.out.println("Accessing or modifying the field of a null object.");
		} catch (ArithmeticException e) {
			System.out.println("Thrown when an exceptional arithmetic condition has occurred.");
		} finally {
			for (int i = 0; i < names.length; i++)
				System.out.println(names[i]);
		}
	}
}
//int a=50/0; ArithmeticException 

//String s=null;  
//System.out.println(s.length()); NullPointerException 

//String s="abc";  
//int i=Integer.parseInt(s); NumberFormatException  

//int a[]=new int[5];  
//a[10]=50; ArrayIndexOutOfBoundsException  