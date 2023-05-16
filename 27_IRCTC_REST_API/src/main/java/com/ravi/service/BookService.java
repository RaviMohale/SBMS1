package com.ravi.service;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

public interface BookService {
	
	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getticket(Integer ticketNum);

}
