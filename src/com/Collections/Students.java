package com.Collections;

import java.io.Serializable;


public class Students implements Serializable {

	private int id;
	private String name;
	private String city;
	
	public Students(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}

	@Override
	public String toString() {
		return "Students [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
	
	
	
	
}
