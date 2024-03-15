package com.java.gaurang.association;

public class company {
	private String companyName;
	private String location;
	
	public company(String companyName, String location) {
		super();
		this.companyName = companyName;
		this.location = location;
	}
	
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	
	
}
