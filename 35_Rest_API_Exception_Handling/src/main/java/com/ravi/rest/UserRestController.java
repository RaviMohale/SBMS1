package com.ravi.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.exception.UserNotFoundException;

@RestController
public class UserRestController {
	
	@GetMapping("/user/{userId}")
	public String getUserName(@PathVariable("userId") Integer userId)throws Exception {
		if(userId == 100) {
			return "Jhon";
		}else if(userId == 102) {
			return "Chaati";
		}else {
			throw new UserNotFoundException("User Not Found");
		}
		
	}

}
