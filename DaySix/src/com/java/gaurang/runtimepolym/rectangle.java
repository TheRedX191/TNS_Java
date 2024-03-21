package com.java.gaurang.runtimepolym;

public class rectangle extends shape{
	private int lenght,breadth;
	
	public void display() {
		System.out.println("Drawing Rectangle with Lenght "+lenght+" Breadth "+breadth);
	}
	public void erase(){
		System.out.println("Erasing Rectangle");
	}
	public int getLenght() {
		return lenght;
	}
	public void setLenght(int lenght) {
		this.lenght = lenght;
	}
	public int getBreadth() {
		return breadth;
	}
	public void setBreadth(int breadth) {
		this.breadth = breadth;
	}
	public rectangle() {
		super();
	}
	public rectangle(int lenght, int breadth) {
		super();
		this.lenght = lenght;
		this.breadth = breadth;
	}
	
	
}
