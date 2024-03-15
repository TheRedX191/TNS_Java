package com.java.gaurang.association;

public class department {
	private String dept_name;
	private int deptId;
	
	public department(String dept_name, int deptId) {
		super();
		this.dept_name = dept_name;
		this.deptId = deptId;
	}
	
	public String getDept_name() {
		return dept_name;
	}
	public void setDept_name(String dept_name) {
		this.dept_name = dept_name;
	}
	public int getDeptId() {
		return deptId;
	}
	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}
	
	
}
