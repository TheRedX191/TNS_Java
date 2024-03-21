package com.java.gaurang.runtimepolym;

public class circle extends shape{
	private float r;
	
	public void display() {
		System.out.println("Drawing circle with radius "+r);
	}
	public void erase(){
		System.out.println("Erasing Circle");
	}
	public float getR() {
		return r;
	}
	public void setR(float r) {
		this.r = r;
	}
	public circle() {
		super();
	}
	public circle(float r) {
		super();
		this.r = r;
	}

}
