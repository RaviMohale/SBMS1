package in.RaviIT;

public class SodexoPayment implements IPayment{
	
	@Override
	public boolean processPayment(double billAmt) {
		System.out.println("Sodexo payment success....");
		return true;
	}

}
