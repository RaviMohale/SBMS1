package in.RaviIT;

public class DebitCartPayment implements IPayment{

	@Override
	public boolean processPayment(double billAmt) {
		// business logic 
		
		System.out.println("Debit Cart Payment is successfull...");
		return true;
	}

}
