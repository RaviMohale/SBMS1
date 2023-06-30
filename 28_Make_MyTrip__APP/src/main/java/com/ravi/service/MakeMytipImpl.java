package com.ravi.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.BodyInserter;
import org.springframework.web.reactive.function.BodyInserters;
import org.springframework.web.reactive.function.client.WebClient;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

@Service
public class MakeMytipImpl implements MakeMyTripService {
	
	private String BOOK_TICKET_URL ="http://13.232.253.164:8080/ticket";
	
	private String GET_TICKET_URL="http://13.232.253.164:8080/ticket/{ticketNum}";
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		
		// get the instance of webClient(impl class object will be come)
		
				WebClient webClient = WebClient.create();
				
				// send post request with passanger data
				//and map response to ticket Object
				
				Ticket ticket = webClient.post()
						 .uri(BOOK_TICKET_URL)
						 .header("Accept", "application/json")
						 .bodyValue(passenger)
						 .retrieve()
						 .bodyToMono(Ticket.class)
						 .block();
				return ticket;
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.postForEntity(BOOK_TICKET_URL, passenger, Ticket.class); Ticket ticket =
		 * responseEntity.getBody(); return ticket;
		 */
		

	}

	@Override
	public Ticket getticket(Integer ticketNumber) {
		
		// get the instance of webClient(impl class object will be come)
		
		WebClient webClient = WebClient.create();
		
		// send get request and map response to ticket Object
		
		Ticket ticket = webClient.get()
				  				    .uri(GET_TICKET_URL, ticketNumber)
				  					.retrieve()
				  					.bodyToMono( Ticket.class)
				  					.block();  //block method  for sync call
		                         //  .subscribe(); // subscribe method for async call
                                    
			return ticket;
		/*
		 * RestTemplate rt = new RestTemplate(); ResponseEntity<Ticket> responseEntity =
		 * rt.getForEntity(GET_TICKET_URL, Ticket.class, ticketNumber); Ticket ticket =
		 * responseEntity.getBody();
		 * return null;
		 */
		
	}
}
