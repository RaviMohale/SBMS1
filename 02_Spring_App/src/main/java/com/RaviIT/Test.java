package com.RaviIT;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmLApplicationContext;
public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext  cxt = 
				new ClassPathXmLApplicationContext("Beans.xml");
		
		
		PaymentService service= cxt.getBean(PaymentService.class);
		
		service.doPayment(450);
	}

}
