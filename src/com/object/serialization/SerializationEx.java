package com.object.serialization;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class SerializationEx {
	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Employee employee = new Employee(101, "Nasser Khan", "System Engineer", 30000);
		User user = new User();
		user.setUsername("itsnesskhan");
		user.setPassword("tasmiya123");
		user.setEmail("itsnesskhan@gmail.com");
		user.setPin(4569);
		FileOutputStream fout = new FileOutputStream("serialization.txt");
	 	ObjectOutputStream out = new ObjectOutputStream(fout);
	 	out.writeObject(employee);
	 	out.writeObject(user);
	 	System.out.println("object writen succesfully!");
	 	FileInputStream fin = new FileInputStream("serialization.txt");
	 	ObjectInputStream oin = new ObjectInputStream(fin);
	 	System.out.println("reading from file");
	 	boolean flag = true;
	 	while (flag) {
			Object object = oin.readObject();
	 	if (object instanceof User) {
	 		User fileUser = (User) object;
	 		System.out.println(fileUser);
	 		flag = false;
		}
	 	if (object instanceof Employee) {
	 		Employee employee2 =(Employee) object;
	 		System.out.println(employee2);
		}
	 	}
	}

}
