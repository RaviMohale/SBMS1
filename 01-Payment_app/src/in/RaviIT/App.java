package in.RaviIT;

public class App {
	public static void main(String[] args) {
		
		//IPayment p = new DebitCartPayment();
		
		//IPayment p = new CreditCardPaymet();
		
		IPayment p = new SodexoPayment();
		
		// if we perform constructor injection and setter injection  setter injection will override 
		// constructor injection
		
		PaymentService service = new PaymentService(p);// constructor injection
		
		//PaymentService service = new PaymentService();
			service.setPayment(p);   // setter injection
		
			service.doPayment(450.00);
		
	}

}
