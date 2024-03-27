package com.java.gaurang.framework;

public abstract class PrimeAcc extends ShopAcc{
	private boolean isPrime;

	public PrimeAcc(int accNo, String accNm, float charges, boolean isPrime) {
		super(accNo, accNm, charges);
		this.isPrime = isPrime;
	}

	public boolean isPrime() {
		return isPrime;
	}

	public void setPrime(boolean isPrime) {
		this.isPrime = isPrime;
	}
	public void bookProduct(float no) {
		System.out.println("No of Items Booked are: "+no+"With amount: "+getCharges());
		
	}

	@Override
	public String toString() {
		return "PrimeAcc [isPrime=" + isPrime + "]";
	}
	
	
}
