package com.java.opps;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

final public class Emplyee {

	final private int id;
	final private String name;
	final private List<Address> address;
	
	public Emplyee(int id, String name, List<Address> address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public int getId() {
		return id;
	}
	
	

	
//	public Address getAddress() {
//		return new Address(address);
//	}
	
	public List<Address> getAddress() {
//		ArrayList<Address> list = new ArrayList<>(); //deep copy
//		list.addAll(address);
//		System.out.println("deep copy"+list);
		return new ArrayList<Address>(address);
				
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Emplyee [id=" + id + 
				", name=" + name + ","
						+ ""
						+ " address=" + address + "]";
	}

		
	
}
