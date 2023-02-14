package com.Collections;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.sound.midi.Soundbank;

import org.w3c.dom.ls.LSOutput;

public class ObjectStream {

	public static void main(String[] args) throws IOException {
		try {
//			File file = new File("object.txt");
//			Students students = new Students(1, "Nasser Khan", "Indore");
//			ObjectOutputStream stream = new ObjectOutputStream(new FileOutputStream(file));
//			stream.writeObject(students);
//			stream.flush();
//			stream.close();
//			System.out.println("write in the file");
//
//			ObjectInputStream stream2 = new ObjectInputStream(new FileInputStream(file));
////			System.out.println(stream2.readObject());
////			will throw eof ex so cause there is nothing to read in there
//			Students instance = (Students) stream2.readObject();
//			System.out.println(instance);
//			stream2.close();\
			
			File file = new File("object.txt");
			System.out.println(file.canWrite());
			System.out.println(file.canRead());
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
