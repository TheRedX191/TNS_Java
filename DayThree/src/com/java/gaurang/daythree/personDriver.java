package com.java.gaurang.daythree;

import java.util.Scanner;

public class personDriver {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter ID: ");
		int id = sc.nextInt();
		System.out.println("Enter Age: ");
		int age = sc.nextInt();
		System.out.println("Enter Income: ");
		double income= sc.nextDouble();
		System.out.println("Enter Name:");
		String name = sc.next();
		System.out.println("Enter Gender:");
		String gender = sc.next();
		
		person p1 = new person(id, age, name, gender, income);
		
		taxCalci tc = new taxCalci();
		tc.taxCalculate(p1);
		System.out.println(p1);
		sc.close();
	}

}