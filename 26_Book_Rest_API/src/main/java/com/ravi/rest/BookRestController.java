package com.ravi.rest;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;


import com.ravi.binding.Book;

@RestController
public class BookRestController {
	
	@GetMapping(value= "/book",
			produces = {"application/xml","application/json"})
	public Book getbook() {
		Book b = new Book();
		b.setId(101);
		b.setName("Java");
		b.setPrice(250.00);
		
		return b;
	}

	
	@PostMapping(value = "/book",
			consumes= {"application/xml","application/json"})
	public ResponseEntity<String> addBook(){
		
		String msg = "Record Saved";
		return new ResponseEntity<String>(msg,HttpStatus.CREATED); 
	}
}
