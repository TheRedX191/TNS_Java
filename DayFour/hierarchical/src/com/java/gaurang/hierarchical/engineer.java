package com.java.gaurang.hierarchical;

public class engineer extends person{
	private String course_name;
	private String year;
	private int fees;
	public engineer() {
		super();
		// TODO Auto-generated constructor stub
	}


	public engineer(String course_name, String year, int fees) {
		super();
		this.course_name = course_name;
		this.year = year;
		this.fees = fees;
	}


	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getFees() {
		return fees;
	}
	public void setFees(int fees) {
		this.fees = fees;
	}


	@Override
	public String toString() {
		return "engineer [course_name=" + course_name + ", year=" + year + ", fees=" + fees + "]";
	}
	
	
}
