package com.java.gaurang.hierarchical;

public class student extends person{
	private int rno;
	private String clgName;
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(int rno, String clgName) {
		super();
		this.rno = 1;
		this.clgName = "Watumull";
	}
	public student(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getClgName() {
		return clgName;
	}
	public void setClgName(String clgName) {
		this.clgName = clgName;
	}
	@Override
	public String toString() {
		return "student [rno=" + rno + ", clgName=" + clgName + "]";
	}
	
	
}
