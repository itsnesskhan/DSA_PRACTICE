package com.java.opps;

import java.util.HashMap;
import java.util.HashSet;

public class ImmutableClassExample {
	
	public static void main(String[] args) {
//		FakeStudent fakeStudent = new FakeStudent(2, "zoya");
//		Student student = fakeStudent;
//		HashMap<Student,Integer> map = new HashMap<>();
//		map.put(student, 1001);
//		System.out.println(map);
//		System.out.println("student hascode"+student.hashCode());
//		fakeStudent.setFakename("Hamda");
//		System.out.println("student hash after"+fakeStudent.hashCode());
//		System.out.println(fakeStudent.equals(student));
//		
//		System.out.println(map.get(student));

		
		HashMap<Student,String> map = new HashMap<>();
		Student student = new Student(1, "Hamda");
		Student student2 = new Student(1, "Hamda");
		map.put(student, "Hii");
		map.put(student2, "Hi");
		
//		to avoide to duplicate entry of object use hashcode and equals method in class
		
		System.out.println(map);
		
				
		
		
	}
}
