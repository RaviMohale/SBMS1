package in.RaviIT;

public class CreditCardPaymet implements IPayment {
	
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Credit cart payment Success...");
		return true;
	}

}
