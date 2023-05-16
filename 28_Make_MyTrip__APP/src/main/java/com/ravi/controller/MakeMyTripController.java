package com.ravi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.ravi.request.Passenger;
import com.ravi.response.Ticket;
import com.ravi.service.MakeMyTripService;

@Controller
public class MakeMyTripController {
	
	@Autowired
	private  MakeMyTripService service;
	
	@GetMapping("/get-ticket")
	public String getTicket(@RequestParam Integer ticketNumber,Model model) {
		Ticket getticket = service.getticket(ticketNumber);
		model.addAttribute("getticket", getticket);
		return"ticket-form";
	}
	
	@GetMapping("/ticket")
	public String getTicketForm(Model model) {
		model.addAttribute("ticket", new Ticket());
		return"ticket-form";
	}
	
	@PostMapping("/book-ticket")
	public String  bookTicket(@ModelAttribute("passenger")Passenger  passenger,Model model) {
		System.out.println(passenger);
		
		Ticket ticket = service.bookTicket(passenger);
		model.addAttribute("msg","your ticket booked with Id:"+ticket.getTicketNum());
		return "index";
	}
	
	@GetMapping("/")
	public String loadForm(Model model) {
		model.addAttribute("passenger",new  Passenger());
		return "index";
	}

}
