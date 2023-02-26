package com.practice.iostreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoStreamsEx2 {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws IOException {
		File file = new File("MyFolder");
		file.mkdir();
		File file2 = new File(file, "inside.txt");
		file2.createNewFile();
		FileOutputStream oStream = new FileOutputStream(file2);
		String string = "hiii i am writing using output stream";
		oStream.write(string.getBytes());
		oStream.close();
		
		FileInputStream stream = new FileInputStream(file2);
		int read = stream.read();
		System.out.println((char)read);
		while ((read = stream.read())!= -1) {
			System.out.print((char)read);
		}
		
	}

}
