package com.java.opps;

public class FakeStudent extends Student {

	public int value = 10;

	

	private String fakename;

	public FakeStudent(int id, String name) {
		super(id, name);
		this.fakename = name;
	}

	public String getFakename() {
		return fakename;
	}
	
	

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return this.getFakename();
	}

	public void setFakename(String fakename) {
		this.fakename = fakename;
	}

	@Override
	public String toString() {
		return "FakeStudent [fakename=" + fakename + "]";
	}

}
