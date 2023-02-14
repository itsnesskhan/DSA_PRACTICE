package com.java.opps;

import java.util.Objects;

public class Student {
	final private int id;
	final private String name;
//	public int value = 100;

	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
		System.out.println("parent construtor called");
	}

	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}

}
