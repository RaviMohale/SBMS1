package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	@GetMapping("/hi")
	public String  getMsg() {
		return "hi ..hello";
	}
	
	@GetMapping("/logg")
	public String login() {
		return "login success";
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "90 90 90 90 90";
	}

}
