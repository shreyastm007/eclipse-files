package com.thoughtfocus;

import java.io.*;

public class DePersist {

	public static void main(String args[]) {
		try {
			//It creates an ObjectInputStream that reads from the specified InputStream.
			ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt")); 
			Student s = (Student) in.readObject(); //It reads an object from the input stream.
			// printing the data of the serialized object
			System.out.println(s.id + " " + s.name);
			in.close(); // closing the stream
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
