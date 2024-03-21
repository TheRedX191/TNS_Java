package com.java.gaurang.runtimepolym;

public class square extends shape{
	private int side;
	
	public void display() {
		System.out.println("Drawing Square with sides "+side);
	}
	public void erase(){
		System.out.println("Erasing Square");
	}
	public int getSide() {
		return side;
	}
	public void setSide(int side) {
		this.side = side;
	}
	public square() {
		super();
	}
	public square(int side) {
		super();
		this.side = side;
	}
	
	
}
