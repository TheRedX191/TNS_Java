package com.java.gaurang.daythree;

public class taxCalci {
	public void taxCalculate(person p) {
		if(p.getGender().equalsIgnoreCase("female")||p.getAge()>65) {
			p.setTax(0);
		}
		else {
			if(p.getIncome()<=160000) {
				p.setTax(0);
			}
			else if(p.getIncome()>160000 && p.getIncome()<=500000) {
				p.setTax((p.getIncome()-160000)*0.1);
			}
			else if(p.getIncome()>500000 && p.getIncome()<=800000) {
				p.setTax(((p.getIncome()-160000)*0.2)+32000);
			}
			else{
				p.setTax(((p.getIncome()-160000)*0.3)+94000);
			}
		}
	}
}
