package com.thoughtfocus;

import java.io.*;

public class Persist {
	public static void main(String args[]) {
		try {
			// Creating the object
			Student s1 = new Student(211, "ravi");
			// Creating stream and writing the object
			FileOutputStream fout = new FileOutputStream("f.txt");
			ObjectOutputStream out = new ObjectOutputStream(fout);
			out.writeObject(s1);// It writes the specified object to the ObjectOutputStream.
			out.flush(); // It flushes the current output stream.
			out.close(); // It closes the current output stream.
			System.out.println("success");
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
