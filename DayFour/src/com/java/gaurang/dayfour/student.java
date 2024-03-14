package com.java.gaurang.dayfour;

public class student extends citizen{
	private int rno;
	private String course;
	private String collegename;
	
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getCourse() {
		return course;
	}
	public void setCourse(String course) {
		this.course = course;
	}
	public String getCollegename() {
		return collegename;
	}
	public void setCollegename(String collegename) {
		this.collegename = collegename;
	}
	public student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public student(String name, int age, long phn_no, String gender, int rno, String course, String collegename) {
		super(name, age, phn_no, gender);
		this.rno = rno;
		this.course = course;
		this.collegename = collegename;
	}
	@Override
	public String toString() {
		return "student [rno=" + rno + ", course=" + course + ", collegename=" + collegename + ", getName()="
				+ getName() + ", getAge()=" + getAge() + ", getPhn_no()=" + getPhn_no() + ", getGender()=" + getGender()
				+ "]";
	}
	
	
	
	
	
	
}
