package com.java.gaurang.association;

public class person {
	private int age;
	private String name;
	
	// Dependency
	private Address address;


	
	public person(int age, String name, Address address) {
		super();
		this.age = age;
		this.name = name;
		this.address = address;
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



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public void displayData() {
		System.out.println("Name: "+name+"Age: "+age+"Address: "+address.getStreet()+address.getCity()+address.getState()+address.getZipcode());
	}
}
