package com.java.gaurang.framework;

public class NormalAcc extends ShopAcc{
	private final float deliveryCharges;


	public NormalAcc(int accNo, String accNm, float charges, float deliveryCharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliveryCharges;
	}

	public float getDeliveryCharges() {
		return deliveryCharges;
	}

	public void bookProduct(float no) {
		System.out.println("No of Items Booked are: "+no+"With amount: "+getCharges()+" and delivery charges: "+deliveryCharges);
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
	
}
