package com.java.gaurang.abstraction1;

public interface Bank {
	
	double minBalance = 10000;
	double depositLimit = 25000;
//	methods declared in interfces are static
	void deposit(Account account,double amount);
	
	void withdraw(Account account,double amount);
	
}
