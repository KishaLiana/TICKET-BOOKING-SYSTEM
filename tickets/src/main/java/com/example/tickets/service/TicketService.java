package com.example.tickets.service;

import com.example.tickets.model.Ticket;
import com.example.tickets.payload.TicketRequest;
import com.example.tickets.payload.TicketResponse;
import com.example.tickets.repository.TicketRepository;
import com.example.tickets.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

	@Autowired
	private TicketRepository ticketRepository;

	public List<TicketResponse> getAllTickets() {

		List<TicketResponse> tickets = new ArrayList<>();
		
		for(Ticket ticket : ticketRepository.findAll()) {
			
			TicketResponse resp = new TicketResponse();
			
			resp.setId(ticket.getId());
			/* resp.setMovieTitle(ticket.getMovieTitle()); */
			resp.setDate(ticket.getDate());
			resp.setSeatNumber(ticket.getSeatNumber());
			
			tickets.add(resp);
			
		}
		
		tickets.add(new TicketResponse());

		return tickets;
	}

	public List<TicketResponse> getMovieSelection(UserPrincipal currentUser, TicketResponse request) {

		List<TicketResponse> movies = new ArrayList<>();

		return movies;

	}

	public String createTicket(TicketRequest request) {
		
		 // System.out.println("We are going to save");
		  
		  String response = "Failed";
		 

		Ticket ticket = new Ticket();

		/* ticket.setMovieTitle(request.getMovieTitle()); */
		ticket.setDate(request.getDate());
		ticket.setSeatNumber(request.getSeatNumber());

		Ticket saved = ticketRepository.save(ticket);

		return saved != null ? "Saved" : response;
	}

}