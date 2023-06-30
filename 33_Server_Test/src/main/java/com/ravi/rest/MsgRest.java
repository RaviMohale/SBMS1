package com.ravi.rest;

import org.springframework.web.bind.annotation.RestController;

@RestController

public class MsgRest {
	
	public String welcomeMsg() {
		String msg = "Welcome to Java";
		return msg;
	}

}
