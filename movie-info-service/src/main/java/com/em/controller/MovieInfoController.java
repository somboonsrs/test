package com.em.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.Movie;

@RestController
@RequestMapping("/minfo")
public class MovieInfoController {

	@RequestMapping("/{movieId}")
	public Movie getMovieInfo(@PathVariable(name="movieId") String movieId) {
		return new Movie(movieId,"Lovely Bone...");
	}	
}
