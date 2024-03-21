package com.java.gaurang.abstraction;

public class driver {
	public static void main(String[] args) {
		shape s;
		s = new square(4);
		s.Area();
		s.show();
		
		s = new rectangle(5, 9);
		s.Area();
		s.show();
		
		s = new triangle(8,5);
        s.Area();
		s.show();
	}
}
