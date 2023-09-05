package com.java.practice.takeMahindra;

import java.util.Date;

import com.java.opps.Address;

class Student {

	private int id;
	private String name;
	private int age;

	private Address address;


	public Student() {
	}

	public Student(String name, int age, Address address) {
		this.name = name;
		this.age = age;
		this.address = address;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name +", age=" + age + ", address=" + address
				+"]";
	}

}