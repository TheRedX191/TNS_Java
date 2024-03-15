package com.java.gaurang.staticdemo;

public class employee {
	private int empid;
	private String name;
	private static String companyName = "TNS";
	public employee(int empid, String name) {
		super();
		this.empid = empid;
		this.name = name;
	}
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public static String getCompanyName() {
		return companyName;
	}
	public static void setCompanyName(String companyName) {
		employee.companyName = companyName;
	}
	@Override
	public String toString() {
		return "employee [empid=" + empid + ", name=" + name + ", CompanyName= " + companyName + "]";
	}
	
	

}
