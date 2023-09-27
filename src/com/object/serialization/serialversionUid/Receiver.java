package com.object.serialization.serialversionUid;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.ObjectInputStream;



public class Receiver {
		public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
			ObjectInputStream outputStream = new ObjectInputStream(new FileInputStream("version.txt"));
			Object object = outputStream.readObject();
			System.out.println("object read from file");
			System.out.println((User)object);
			outputStream.close();
			
			//if we modified user class after serialization
			// add something else in it, then in deserialization
			// we get error class cast exception
			//if we don't set serialversion id then jvm assgin it
			//so always urself generate serialversionid in serialization
		}
}