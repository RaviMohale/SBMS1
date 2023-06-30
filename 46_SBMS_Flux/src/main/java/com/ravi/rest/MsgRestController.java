package com.ravi.rest;

import java.util.stream.Stream;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class MsgRestController {
	
	public String Flux() {
		//Stream.of(null)
		Stream.generate(null)
		return "";
	}

}
