package com.object.serialization.serialversionUid;

import java.io.Serializable;

class User implements Serializable {

	private static final long serialVersionUID = -5036607376273706296L;
	private Integer id;
	private String name;
	private String city; // modified user class before deserialization
	
	public User(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + "]";
	}
	
	
	

}