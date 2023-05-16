package com.ravi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@PostMapping("/welcome")
	public ResponseEntity<String> getMsg() {
		String responseBody = "Welcome to Rest API";
		return new ResponseEntity<String>(responseBody,HttpStatus.CREATED);
	}
	
	@GetMapping("/greet")
	public String getGreet() {
		String msg = "Good Morning...";
		return msg;
	}
	
	@PostMapping("/msg")
	public ResponseEntity<String> saveMsg() {
		
		String msg = "message save successfull"; 
		return new ResponseEntity<String>(msg, HttpStatus.OK);
	}

}
