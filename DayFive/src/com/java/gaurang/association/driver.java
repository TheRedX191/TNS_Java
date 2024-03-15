package com.java.gaurang.association;

public class driver {
	public static void main(String[] args) {
		Address address = new Address("B Cabin Road","Ambarnath","Maharashtra",400005);
		person p = new person(21,"Gaurang",address);
		
		p.displayData();
		
}
}
