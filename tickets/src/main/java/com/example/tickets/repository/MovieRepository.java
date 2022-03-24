package com.example.tickets.repository;

import com.example.tickets.model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;
import java.util.Optional;

@Repository
public interface MovieRepository extends JpaRepository<Movie, Long> {
    Optional<Movie> findByMovieTitle(String movieTitle);

    Optional<Movie> findByDescription(String description);

    List<Movie> findByIdIn(List<Long> movieIds);

    Optional<Movie> findByDate(Date date);
    
    Optional<Movie> findByTime(String time);

    Boolean existsByMovieTitle(String movieTitle);
    
    Boolean existsByDate(Date date);

}