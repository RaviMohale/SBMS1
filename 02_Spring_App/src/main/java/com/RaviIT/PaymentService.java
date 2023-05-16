package com.RaviIT;



public class PaymentService  {
	
	
  private Ipayment payment;
	
	
	public PaymentService() {
		System.out.println("this is zero param constructor...");
		
	}
	
	public PaymentService(Ipayment payment) {
		System.out.println("this is parameteris constructor...");
		this.payment = payment;
	}
	
	
	public void setPayment(Ipayment payment) {
		this.payment = payment;
	}
	
	public  void doPayment(double billAmt) {
		boolean status	= payment.processPayment(billAmt);
		if(status) {
			
			System.out.println("printing recipt");
		}else {
			System.out.println("payment decline");
		}
			
		}
	

}
