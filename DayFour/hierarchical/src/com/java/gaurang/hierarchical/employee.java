package com.java.gaurang.hierarchical;

public class employee extends person{
	private int emp_id;
	private String dept_name;
	private int dept_id;
	public employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public employee(String name, String gender, int age) {
		super(name, gender, age);
		// TODO Auto-generated constructor stub
	}
	public employee(int emp_id, String dept_name, int dept_id) {
		super();
		this.emp_id = emp_id;
		this.dept_name = dept_name;
		this.dept_id = dept_id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getDept_id() {
		return dept_id;
	}
	public void setDept_id(int dept_id) {
		this.dept_id = dept_id;
	}
	@Override
	public String toString() {
		return "employee [emp_id=" + emp_id + ", dept_name=" + dept_name + ", dept_id=" + dept_id + "]";
	}
	
	
	

}
