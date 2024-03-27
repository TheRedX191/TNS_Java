package com.java.gaurang.framework;

public abstract class ShopAcc {
	private int accNo;
	private String accNm;
	private float charges;
	
	public ShopAcc(int accNo, String accNm, float charges) {
		super();
		this.accNo = accNo;
		this.accNm = accNm;
		this.charges = charges;
	}

	public int getAccNo() {
		return accNo;
	}

	public void setAccNo(int accNo) {
		this.accNo = accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getCharges() {
		return charges;
	}

	public void setCharges(float charges) {
		this.charges = charges;
	}
	
	public void bookProduct(float no) {
		
		System.out.println("No of Items Booked are: "+no+"With amount: "+charges);
		
		
	}
	public void items(String itemName)
	{
		System.out.println(itemName+" has added to the cart");
	}

	@Override
	public String toString() {
		return "ShopAcc [accNo=" + accNo + ", accNm=" + accNm + ", charges=" + charges + "]";
	}
	
	
}
