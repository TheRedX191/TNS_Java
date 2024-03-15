package com.java.gaurang.association;

public class driver {

	public static void main(String[] args) {
		department dept=new department("Software Devlopment",106);
		company comp = new company("TCS","Mumbai");
		
		employee e1 = new employee(1,76000,"Gaurang",dept,comp);
		System.out.println(e1);
	}

}
