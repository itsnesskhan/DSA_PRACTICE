package com.object.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternalizationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
//		Employee employee = new Employee(101, "Nasser Khan", "System Engineer", 30000);
		UserEx user = new UserEx();
		user.setUsername("itsnesskhan");
		user.setPassword("tasmiya123");
		user.setEmail("itsnesskhan@gmail.com");
		user.setPin(4569);
		FileOutputStream fout = new FileOutputStream("extrnalization.txt");
	 	ObjectOutputStream out = new ObjectOutputStream(fout);
//	 	out.writeObject(employee);
	 	out.writeObject(user);
	 	System.out.println("object writen succesfully!");
	 	FileInputStream fin = new FileInputStream("extrnalization.txt");
	 	ObjectInputStream oin = new ObjectInputStream(fin);
	 	System.out.println("reading from file");
	 	UserEx newuser = (UserEx) oin.readObject();
	 	System.out.println(newuser);
	 	
	 	//sender receiver in seprate file to understand use of seriaversionUID

	}

}

