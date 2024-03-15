package com.java.gaurang.hierarchical;

public class driver {

	public static void main(String[] args) {
		person p;
		person p1= new person();	// Tight Coupling
		p1.setName("Gaurang");
		p1.setAge(21);
		p1.setGender("Male");
		System.out.println(p1);
		
		p = new student(28,"Watumull"); // Dynamic Binding OR loose Coupling
		System.out.println(p);
		
		p = new employee(101,"Software Engineer",106);
		System.out.println(p);
		
		p = new engineer("Computer Engineering","BE",143269);
		System.out.println(p);

}
}
