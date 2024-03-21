package com.java.gaurang.abstraction;

public class rectangle extends shape{
	
	private float lenght, breadth;

	public rectangle() {
		this.lenght = 5.0f;
		this.breadth = 2.0f;
	}

	public rectangle(float width, float height) {
		this.lenght = width;
		this.breadth = height;
	}

	@Override
	void Area() {
		area=lenght*breadth;		
	}

}
