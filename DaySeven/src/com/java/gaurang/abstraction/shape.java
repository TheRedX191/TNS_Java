package com.java.gaurang.abstraction;

public abstract class shape {
 protected float area;
     
     //abstract method 
	 abstract void Area();
	 
	 //concrete method
	 void show()
	 {
		 System.out.println("Area of shape is "+area);
	 }

}
