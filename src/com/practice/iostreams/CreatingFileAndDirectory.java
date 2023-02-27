package com.practice.iostreams;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class CreatingFileAndDirectory {
	public static void main(String[] args) throws IOException {
		File file = new File("abc.txt");
//		System.out.println(file.isFile());
		file.createNewFile();
//		System.out.println(file.isFile());
//		System.out.println(file.isDirectory());
		BufferedWriter writer = new BufferedWriter(new FileWriter(file));
		writer.write("Hello, for the first time i am writng into a file");
		writer.newLine(); // or \backlash n at the start
		writer.write("what do you think, how's it ?");
		
		writer.close();
		
		BufferedReader reader = new BufferedReader(new FileReader(file));
		int i;
//		while ((i= reader.read())!= -1) {
//			System.out.println((char)i);      for one character
//		}
		
		String readLine =null;
		while ((readLine = reader.readLine()) != null) {
			System.out.println(readLine);
		}
		
	}

}
