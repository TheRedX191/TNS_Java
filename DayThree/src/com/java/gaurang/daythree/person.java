package com.java.gaurang.daythree;

public class person {
	private int id,age;
	private String name;
	private String gender;
	private double income,tax;
	public person(int id, int age, String name, String gender, double income) {
		super();
		this.id = id;
		this.age = age;
		this.name = name;
		this.gender = gender;
		this.income = income;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
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
	public double getIncome() {
		return income;
	}
	public void setIncome(double income) {
		this.income = income;
	}
	public double getTax() {
		return tax;
	}
	public void setTax(double tax) {
		this.tax = tax;
	}
	@Override
	public String toString() {
		return "person [id=" + id + ", age=" + age + ", name=" + name + ", gender=" + gender + ", income=" + income
				+ ", tax=" + tax + "]";
	}

	
}
