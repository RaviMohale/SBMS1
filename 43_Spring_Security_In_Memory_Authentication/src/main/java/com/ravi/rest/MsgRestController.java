package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/greet")
	public String greetMsg() {
		
		return "good morning...";
	}
	
	
	@GetMapping("/welcome")
	public String welcomeMsg() {
		
		return "welcome to our app...";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return  "9090909090";
				}

}
