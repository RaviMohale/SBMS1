package com.ravi.service;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;

public interface MakeMyTripService {

	public Ticket bookTicket(Passenger passenger);
	
	public Ticket getticket(Integer ticketNumber);
}
