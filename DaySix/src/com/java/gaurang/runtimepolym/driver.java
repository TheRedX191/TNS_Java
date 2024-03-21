package com.java.gaurang.runtimepolym;


public class driver {
	public static void main(String[] args) {
		shape s;
		
		s = new shape();
		s.display();
		s.erase();
		
		s = new circle(5);
		s.display();
		s.erase();
		
		s= new square(4);
		s.display();
		s.erase();
		
		s = new rectangle(5,4);
		s.display();
		s.erase();
		
		s= new triangle(7,5);
		s.display();
		s.erase();
	}
}
