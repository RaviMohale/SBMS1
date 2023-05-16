package in.RaviIT;

public class PaymentService {
	
	private IPayment payment;
	
	
	public PaymentService() {
		
	}
	
	// 1 para constructor
	public PaymentService(IPayment payment) {
		this.payment = payment;
	}
	
	//setter method
	
	public void setPayment(IPayment payment) {
		this.payment = payment;
	}
	
	
	// entry point for payment
	public  void doPayment(double billAmt) {
	boolean status	= payment.processPayment(billAmt);
	if(status) {
		
		System.out.println("printing recipt");
	}else {
		System.out.println("payment decline");
	}
		
	}

}
