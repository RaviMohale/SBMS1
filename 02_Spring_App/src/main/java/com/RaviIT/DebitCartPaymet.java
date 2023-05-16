package com.RaviIT;

public class DebitCartPaymet implements Ipayment {
	
	@Override
	public boolean processPayment(double billAmt) {
		// TODO Auto-generated method stub
		System.out.println("debit card payment succes...");
		return true;
	}
}
