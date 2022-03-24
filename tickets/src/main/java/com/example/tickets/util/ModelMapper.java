package com.example.tickets.util;

import com.example.tickets.model.Movie;
import com.example.tickets.model.User;
//import com.example.polls.payload.ChoiceResponse;
import com.example.tickets.payload.MovieResponse;
import com.example.tickets.payload.UserSummary;

import java.time.Instant;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ModelMapper {

	public static MovieResponse mapMovieToMovieResponse(Movie movie, User creator) {
		MovieResponse movieResponse = new MovieResponse();
		movieResponse.setId(movie.getId());
		movieResponse.setMovieTitle(movie.getMovieTitle());
		movieResponse.setDescription(movie.getDescription());
		movieResponse.setDate(movie.getDate());
		movieResponse.setTime(movie.getTime());
		movieResponse.setPrice(movie.getPrice());
//        Instant now = Instant.now();
//        movieResponse.setExpired(movie.getExpirationDateTime().isBefore(now));

//        List<ChoiceResponse> choiceResponses = poll.getChoices().stream().map(choice -> {
//            ChoiceResponse choiceResponse = new ChoiceResponse();
//            choiceResponse.setId(choice.getId());
//            choiceResponse.setText(choice.getText());
//
//            if(choiceVotesMap.containsKey(choice.getId())) {
//                choiceResponse.setVoteCount(choiceVotesMap.get(choice.getId()));
//            } else {
//                choiceResponse.setVoteCount(0);
//            }
//            return choiceResponse;
//        }).collect(Collectors.toList());

//        pollResponse.setChoices(choiceResponses);
		UserSummary creatorSummary = new UserSummary(creator.getId(), creator.getUsername(), creator.getName());
		movieResponse.setCreatedBy(creatorSummary);

//        if(userVote != null) {
//            pollResponse.setSelectedChoice(userVote);
//        }

//        long totalVotes = pollResponse.getChoices().stream().mapToLong(ChoiceResponse::getVoteCount).sum();
//        pollResponse.setTotalVotes(totalVotes);

		return movieResponse;
	}
}