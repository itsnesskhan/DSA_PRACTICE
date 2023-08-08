package com.java.concepts;

import java.util.HashMap;
import java.util.Objects;

class Employee {
	private int id;
	private String name;
	
	public Employee(int id, String name) {
		this.id = id;
		this.name = name;
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
		Employee other = (Employee) obj;
		return id == other.id && Objects.equals(name, other.name);
	}



	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
}

public class HashEquals {

	public static void main(String[] args) {
		Employee employee = new Employee(101, "Nasser Khan");
		Employee employee2 = new Employee(101, "Nasser Khan");
		HashMap<Employee, Integer> map = new HashMap<>();
		
		map.put(employee, 101);
		map.put(employee2, 101);
		
		//we write hashcode and equals method, so that the duplicate elements(key) wont'be inserted
		//if hash of two object is equal then will compare content of the objects using equals
		System.out.println(map);
	}
}
