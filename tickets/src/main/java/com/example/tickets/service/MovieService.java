package com.example.tickets.service;

import com.example.tickets.model.Movie;
import com.example.tickets.payload.MovieRequest;
import com.example.tickets.payload.MovieResponse;
import com.example.tickets.repository.MovieRepository;
import com.example.tickets.security.UserPrincipal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class MovieService {

	@Autowired
	private MovieRepository movieRepository;

	public List<MovieResponse> getAllMovies() {

		List<MovieResponse> movies = new ArrayList<>();
		
		for(Movie movie : movieRepository.findAll()) {
			
			MovieResponse resp = new MovieResponse();
			
			resp.setId(movie.getId());
			resp.setMovieTitle(movie.getMovieTitle());
			resp.setDescription(movie.getDescription());
			
			movies.add(resp);
			
		}
		
		movies.add(new MovieResponse("Tinder Swidler", "This is a must watch"));

		return movies;
	}

	public List<MovieResponse> getMovieSelection(UserPrincipal currentUser, MovieResponse request) {

		List<MovieResponse> movies = new ArrayList<>();

		return movies;

	}
	
	public String createMovie(MovieRequest request) {
		
		System.out.println("We are going to save");
		
		String response = "Failed";
		
		Movie movie = new Movie();
		
		movie.setMovieTitle(request.getTitle());
		movie.setDescription(request.getDescription());
		movie.setTime(request.getTime());
		movie.setDate(new Date());
		movie.setPrice(request.getPrice());
		
		Movie saved = movieRepository.save(movie);
		
		return saved != null ? "Saved" :  response;
	}

}