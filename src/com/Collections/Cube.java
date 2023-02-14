package com.Collections;

public class Cube extends Ractangle {
	
	private float length;

	public Cube(float length, float hight) {
		super(length, hight);
		this.length = length;
	}

	public float getLength() {
		return length;
	}

	public void setLength(float length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "Cube [length=" + length + "]";
	}
	
	
	
	

}
