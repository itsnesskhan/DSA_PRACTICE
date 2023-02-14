package com.Collections;

public class Ractangle {
	private float length;
	private float hight;
	
	public Ractangle(float length, float hight) {
		super();
		this.length = length;
		this.hight = hight;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	public float getHight() {
		return hight;
	}

	public void setHight(float hight) {
		this.hight = hight;
	}

	@Override
	public String toString() {
		return "Ractangle [length=" + length + ", hight=" + hight + "]";
	}
	
	
	
	
}
