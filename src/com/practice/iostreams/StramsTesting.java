package com.practice.iostreams;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class StramsTesting {
	public static void main(String[] args) throws IOException {
		FileOutputStream outputStream = new FileOutputStream("F:\\11.22.63\\my.jpg");
		BufferedOutputStream bf = new BufferedOutputStream(outputStream);
		FileInputStream inputStream = new FileInputStream("abc.txt");
		int j= 0;
		while (( j =inputStream.read())!=-1) {
			System.out.print((char)j);
		}
		int available = inputStream.available();
		System.out.println(available);
		byte[]  b =new byte[available];
		int read = inputStream.read(b);
		System.out.println(read);
		for (byte c : b) {
			System.out.print((char)c);
		}
		
		
		bf.close();
		inputStream.close();
		
	}
}
