package com.Collections;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesEx {
	public static void main(String[] args) throws FileNotFoundException, IOException {
		Properties properties = new Properties();
		
		properties.store(new FileOutputStream("abc.properties"), "First Property in file");
		properties.setProperty("username","itsnesskhan");
		properties.setProperty("password","iamess");
		properties.setProperty("Hamda","Nasser");
		System.out.println("properties set successfully");
		
		properties.load(new FileInputStream("abc.properties"));
		String userme =(String)properties.get("username");
		String my =(String)properties.get("Hamda");
		System.out.println(userme);
		System.out.println(my);
		
	}
}
