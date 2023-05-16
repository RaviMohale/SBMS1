package com.ravi.service;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;



@Service
public class BookServiceImpl implements BookService{
	
	private Map<Integer,Ticket> ticketMap = new HashMap<>();
	
	private Integer ticketNum = 1;
	
	@Override
	public Ticket bookTicket(Passenger passenger) {
		// TODO Auto-generated method stub
		Ticket t = new Ticket();
		BeanUtils.copyProperties(passenger, t);
		t.setTicketCost(450.00);
		t.setStatus("CONFIRMED");
		t.setTicketNum(ticketNum);
		
	ticketMap.put(ticketNum, t);
	ticketNum++;
		
		return t;
	}
	
	@Override
	public Ticket getticket(Integer ticketNumber) {
		
		if(ticketMap.containsKey(ticketNumber)) {
			return ticketMap.get(ticketNumber);
		}
		return null;
	}

}
