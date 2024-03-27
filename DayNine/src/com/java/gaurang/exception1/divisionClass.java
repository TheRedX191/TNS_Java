package com.java.gaurang.exception1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class divisionClass {
	public static void divide() {
		Scanner sc = new Scanner(System.in);
		int a,b,c;
		try {
			System.out.println("Enter Two Numbers: ");
			a = sc.nextInt();
			b = sc.nextInt();
			c = a/b;
			System.out.println(c);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			System.out.println("Division Exception: "+e.getMessage());
		}catch(InputMismatchException ime) {
			System.out.println("Wrong Input Type: "+ime.getMessage());
		}catch(Exception e) {
			System.out.println("Exception: "+e.getMessage());
		}finally {
			sc.close();
		}
	}

}
