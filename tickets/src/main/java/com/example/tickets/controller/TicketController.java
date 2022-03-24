package com.example.tickets.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tickets.payload.TicketResponse;
import com.example.tickets.payload.TicketRequest;
import com.example.tickets.service.TicketService;

@RestController
@RequestMapping("/api/tickets")
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@GetMapping("/getalltickets")
    public List<TicketResponse> getAllTickets() {
        return ticketService.getAllTickets();
    }
	
	/*
	 * @GetMapping("/my") public List<TicketResponse> getMovieSelection(@CurrentUser
	 * UserPrincipal currentUser, @Valid @RequestBody MovieResponse request) {
	 * return movieService.getMovieSelection(currentUser, request); }
	 */
	@PostMapping("/createticket")
    public String createTicket(@Valid @RequestBody TicketRequest request) {
        return ticketService.createTicket(request);
    }
	
}