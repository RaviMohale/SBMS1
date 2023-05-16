package com.RaviIT;

public class CreditcartPayment implements Ipayment {
	
	@Override
	public boolean processPayment(double billAmt) {
		// TODO Auto-generated method stub
		
		System.out.println("credit cart payment success...");
		return true;
	}

}
