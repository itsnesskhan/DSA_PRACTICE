package com.java.opps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class App {

	public static <T> void main(String[] args) {
//		Address address = new Address("Allahbad","UP", "India");
//		Emplyee emplyee = new Emplyee(1, "Hamda Khan",address );
//		System.out.println(emplyee);
//		Address address2 = emplyee.getAddress();
//		System.out.println(address.equals(address2));
//		address2.setCity("Indore");
//		address2.setCourntry("India");
//		System.out.println(emplyee);
		
		
		ArrayList<Address> list = new ArrayList<>();
		list.add(new Address("Indore", "MP", "India"));
		list.add(new Address("Allahbad", "UP", "India"));
		list.add(new Address("Mumbai", "MH", "India"));
		
//		List<Address> list2 = Collections.unmodifiableList(list);
//		list2.add(new Address("indoredsfjsd", "sldjf", null));
		
		GenericsEx2<Student> genericsEx2 = new GenericsEx2<Student>(new Student(1,"Zoya sdfkdfkjlfd"));
//		genericsEx2.printObj();
		
		Emplyee emplyee = new Emplyee(1, "Hamda Khan", list);
//		GenericsEx2<Emplyee> genericsEx22 = new GenericsEx2<>(emplyee);
//		genericsEx22.printObj();
//		List<Address> address = emplyee.getAddress();
//		System.out.println(address.hashCode());
//		System.out.println(list.hashCode());
		
		System.out.println("###################################################");
		System.out.println("Generic lower bound example");
		
		GenericsExample<Number> genericsExample = new GenericsExample<Number>(5.34, 10.494);
		double additton = genericsExample.getAddition();
		System.out.println("additon"+ additton);
		
		
//		System.out.println(emplyee);

	}

}
