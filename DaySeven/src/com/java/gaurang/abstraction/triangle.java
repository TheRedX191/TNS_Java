package com.java.gaurang.abstraction;

public class triangle extends shape{
	private float base,height;
	
	public triangle() {
		this.base = 7;
		this.height = 3;
	}

	public triangle(float base, float height) {
		super();
		this.base = base;
		this.height = height;
	}
	@Override
	void Area() {
		area =(base*height)/2; 
	}
	
	

}
