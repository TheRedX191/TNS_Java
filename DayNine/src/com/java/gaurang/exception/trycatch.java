package com.java.gaurang.exception;

public class trycatch {
	static int divideNo(int a,int b){
		int result = 0;
		try {
			System.out.println("In Try Block");
			result = a/b;
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
//			e.printStackTrace();
			System.out.println("In Catch Block");
			System.err.println("Exception Occured In Division "+e.getMessage());
		}finally {
			System.out.println("In Finally block");
		}
		return result;
	}

}
