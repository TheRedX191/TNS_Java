package com.java.gaurang.dayfour;

public class citizen {
	private String name;
	private int age;
	private String gender;
	private long phn_no;
	// Default Construc
	public citizen() {
		super();
	}
	
	public citizen(String name, int age, long phn_no,String gender) {
		super();
		this.name = name;
		this.age = age;
		this.phn_no = phn_no;
		this.gender = gender;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public double getPhn_no() {
		return phn_no;
	}
	public void setPhn_no(long phn_no) {
		this.phn_no = phn_no;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "citizen [name=" + name + ", age=" + age + ", gender=" + gender + ", phn_no=" + phn_no + "]";
	}
	
}
