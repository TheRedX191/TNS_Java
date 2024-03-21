package com.java.gaurang.runtimepolym;

public class triangle extends shape{
	private int height,base;
	
	public void display() {
		System.out.println("Drawing Triangle with height "+height+" Base "+base);
	}
	public void erase(){
		System.out.println("Erasing Triangle");
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getBase() {
		return base;
	}
	public void setBase(int base) {
		this.base = base;
	}
	public triangle() {
		super();
	}
	public triangle(int height, int base) {
		super();
		this.height = height;
		this.base = base;
	}
	

}
