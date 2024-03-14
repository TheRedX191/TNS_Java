package com.java.Assignment1;

public class Employee {
	private int employeeId;
	private int age;
	private String employeeName;
	private String employeeAddress;
	private long employeeNo;
	public Employee() {
		super();
		employeeName = "Gaurang";
	}
	
	public Employee(int employeeId, int age, String employeeName, String employeeAddress, long employeeNo) {
		super();
		this.employeeId = employeeId;
		this.age = age;
		this.employeeName = employeeName;
		this.employeeAddress = employeeAddress;
		this.employeeNo = employeeNo;
	}

	public int getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getEmployeeName() {
		return employeeName;
	}
	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}
	public String getEmployeeaddress() {
		return employeeAddress;
	}
	public void setEmployeeaddress(String employeeaddress) {
		employeeAddress = employeeaddress;
	}
	public long getEmployeeNo() {
		return employeeNo;
	}
	public void setEmployeeNo(long employeeNo) {
		this.employeeNo = employeeNo;
	}
	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", age=" + age + ", employeeName=" + employeeName
				+ ", Employeeaddress=" + employeeAddress + ", employeeNo=" + employeeNo + "]";
	}
}
