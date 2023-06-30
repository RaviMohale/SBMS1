package com.ravi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.ravi.feign.GreetFeignClient;

@RestController
public class WelcomeRestController {
	
	@Autowired
	private GreetFeignClient greetClient;
	
	@GetMapping("/welcome")
	public String getWelcomeMsg() {
		
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<String> forEntity =
		 * rt.getForEntity("http://localhost:8081/greet", String.class); 
		 * String greetRes = forEntity.getBody();
		 * return greetRes +  ", Welcome to Ashok IT";
		 */
		
	String greetRes = greetClient.invokeGreetApi();
		
		return greetRes +  ", Welcome to Ashok IT";
	}

}
