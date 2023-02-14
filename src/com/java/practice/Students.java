package com.java.practice;

import java.util.Arrays;
import java.util.List;

public class Students implements Comparable<Students> {
	private int roll;
	private String name;
	private String city;
	
	public Students(int roll, String name, String city) {
		this.roll = roll;
		this.name = name;
		this.city = city;
	}
	
	public int getRoll() {
		return this.roll;

	}
	
	@Override
	public int compareTo(Students that) {
		// TODO Auto-generated method stub
		return this.roll-that.roll;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Students{ "+roll+"name "+name+"}";
	}
	
	public String getName() {
		return this.name;
	}
	public String getCity(){
		return this.city;
	}
	
	public List<Object> StudentDetails() {
		return Arrays.asList(this.roll, this.name, this.city);
	}
	
	
}




