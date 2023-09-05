package com.java.concepts;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Emp implements Comparable<Emp>{
	
	private Integer id;
	private String name;
	private String city;
	
	public Emp(Integer id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public int compareTo(Emp o) {
		return this.id - o.id;
	}

	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", city=" + city + "]";
	}
}

public class ComparableVsComparator {

	public static void main(String[] args) {
		ArrayList<Emp> list = new ArrayList<>();
		list.add(new Emp(111, "Nasser Khan", "Indore"));
		list.add(new Emp(105, "Zoya Khan", "Mumbai"));
		list.add(new Emp(103, "Mohit Malve", "Panwa"));
		
//		Collections.sort(list);
//		System.out.println(list);
		
		Collections.sort(list, new Comparator<Emp>() {

			@Override
			public int compare(Emp o1, Emp o2) {
				return o1.getCity().compareTo(o2.getCity());
			}
		});
		
		System.out.println(list);
	}
}
