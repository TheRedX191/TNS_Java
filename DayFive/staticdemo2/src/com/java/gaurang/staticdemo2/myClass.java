package com.java.gaurang.staticdemo2;

public class myClass {
	private int srno;
	private int branchId;
	private String branch;
	private static int noOfStudents;
	
	static {
		System.out.println("In Static Block");
		noOfStudents = 50;
	}
	public myClass(){
		System.out.println("In Default Constructors");
		branchId++;
		noOfStudents++;
	}
	@Override
	public String toString() {
		return "myClass [srno=" + srno + ", branchId=" + branchId + ", branch=" + branch + "]";
	}
	public void show() {
		System.out.println(branchId);
		System.out.println(noOfStudents);
	}
	
	public static void addStudents() {
//		System.out.println(branchId); 
		System.out.println(noOfStudents);
	}
}
