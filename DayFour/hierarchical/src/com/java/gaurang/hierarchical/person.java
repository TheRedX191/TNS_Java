package com.java.gaurang.hierarchical;

public class person {
	private String name;
	private String gender;
	private int age;
	public person() {
		super();
	}
	public person(String name, String gender, int age) {
		super();
		this.name = "Gaurang";
		this.gender = "male";
		this.age = 21;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "person [name=" + name + ", gender=" + gender + ", age=" + age + "]";
	}
	
	
}
