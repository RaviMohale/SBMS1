package com.ravi;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CustomerRestController {
	
	@GetMapping("/")
	public Customer getCustomer() {
		Customer c = new Customer();
		c.setId(101);
		c.setName("ravi");
		c.setEmail("ravi@gmail.com");
		c.setPhone(788993456);
		
		return c;
	}

}
