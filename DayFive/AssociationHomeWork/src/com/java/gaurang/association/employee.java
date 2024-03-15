package com.java.gaurang.association;

public class employee {
	private int empid;
	private double salary;
	private String name;
	private department Department;
	private company Company;
	public employee(int empid, double salary, String name,department department, company company) {
		super();
		this.empid = empid;
		this.salary = salary;
		this.name = name;
		Department = department;
		Company = company;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public department getDepartment() {
		return Department;
	}
	public void setDepartment(department department) {
		Department = department;
	}
	public company getCompany() {
		return Company;
	}
	public void setCompany(company company) {
		Company = company;
	}

	@Override
	public String toString() {
		return "employee [empid=" + empid + ", salary=" + salary + ", name=" + name + ", Department=" + Department.getDeptId()+" "+Department.getDept_name()+" "+
				",Comapny=  "+Company.getCompanyName()+" "+Company.getLocation()+ "]";
	}
	
	
}
