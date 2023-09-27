package com.object.serialization.serialversionUid;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;




public class Sender {
		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			User user = new User(101, "Nasser Khan");
			ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream("version.txt"));
			outputStream.writeObject(user);
			outputStream.close();
			System.out.println("Object writen in file");
		}
		
}
