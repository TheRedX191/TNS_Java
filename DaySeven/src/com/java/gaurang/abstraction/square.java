package com.java.gaurang.abstraction;

public class square extends shape{
	private float side;
	public square()
	{
		side=2.0f;
	}
	public square(float side)
	{
		this.side=side;
	}
	
	@Override
	void Area() {
		super.area=side*side;		
	}
}
