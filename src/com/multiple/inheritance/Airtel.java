package com.multiple.inheritance;

import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.util.List;
import java.util.stream.Collector;

public interface Airtel {

	@SuppressWarnings("resource")
	default void makeCall() {
		List<String> list = List.of("Nasser","Hamda","Mohit","Suresh");
		String string = "i am sorry hamda, for my behaviour earlier today";
//		list.stream().filter(e->System.out.println(e)).collect(Collector)
		try {
			FileInputStream stream = new FileInputStream("F:\\New folder\\hello.txt");
			int read=0;
			while ((read= stream.read()) != -1) {
				System.out.print((char)read);
				
			}
			
		  BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("F:\\New folder\\hello.txt", true));
			bufferedWriter.write(string);
			System.out.println("write into file successfully");
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("calling using airtel");
		
	}

	default void takeCall() {
		System.out.println("receiving calls suing airtel");
		
	}
	
	public void makeVideoCall();

}
