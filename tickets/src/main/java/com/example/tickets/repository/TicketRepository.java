package com.example.tickets.repository;

import com.example.tickets.model.Ticket;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface TicketRepository extends JpaRepository<Ticket, Long> {
    Optional<Ticket> findByMovieTitle(String movieTitle);

    List<Ticket> findByIdIn(List<Long> ticketIds);

    Optional<Ticket> findByDate(Date date);
    
    //Optional<Ticket> findByTime(String time);
    
    Optional<Ticket> findBySeatNumber(String seatNumber);

    //Boolean existsByMovieTitle(String movieTitle);
    
    //Boolean existsByDate(Date date);
    
    Boolean existsBySeatNumber(String seatNumber);
    
    


}