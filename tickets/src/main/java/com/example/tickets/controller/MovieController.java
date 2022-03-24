package com.example.tickets.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.tickets.payload.MovieRequest;
import com.example.tickets.payload.MovieResponse;
import com.example.tickets.security.CurrentUser;
import com.example.tickets.security.UserPrincipal;
import com.example.tickets.service.MovieService;

@RestController
@RequestMapping("/api/movies")
public class MovieController {
	
	@Autowired
	private MovieService movieService;
	
	@GetMapping("/getallmovies")
    public List<MovieResponse> getAllMovies() {
        return movieService.getAllMovies();
    }
	
	@GetMapping("/myselection")
    public List<MovieResponse> getMovieSelection(@CurrentUser UserPrincipal currentUser, @Valid @RequestBody MovieResponse request) {
        return movieService.getMovieSelection(currentUser, request);
    }
	
	@PostMapping("/createmovie")
    public String createMovie(@Valid @RequestBody MovieRequest request) {
        return movieService.createMovie(request);
    }
	
}