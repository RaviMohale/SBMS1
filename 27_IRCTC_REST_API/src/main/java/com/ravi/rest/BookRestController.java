package com.ravi.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;
import com.ravi.service.BookService;

@RestController
public class BookRestController {
	
	@Autowired
	private BookService service;
	
		//method to book ticket   (method = Post)
	
	@PostMapping(value ="/ticket",
			consumes = {"application/json"},
			produces = {"application/json"})
	public ResponseEntity<Ticket> ticketBooking (@RequestBody Passenger passenger){
		System.out.println(passenger);
			Ticket ticket = service.bookTicket(passenger);
		return new ResponseEntity<>(ticket,HttpStatus.CREATED);
	}
	
			//method to get to get ticket (method = GET)

	@GetMapping(value ="/ticket/{ticketNum}",
			produces = {"application/json"})
	public Ticket getTicketByNum(@PathVariable Integer  ticketNum) {
		return service.getticket(ticketNum);
			
	}
}
