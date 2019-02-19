package com.em.controller;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.em.entity.Movie;
import com.em.entity.MovieCatalog;
import com.em.entity.MovieRating;
import com.em.properties.GlobalProperties;

@RestController
@RequestMapping("/mcatalog")
public class MovieCatalogController {
		
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private GlobalProperties globalProperties;
	
	

	/*
	 * @RequestMapping("/{userId}") public Movie getCatalog(@PathVariable("userId")
	 * String userId){ return
	 * restTemplate.getForObject(globalProperties.getMovieInfoURL()+userId,
	 * Movie.class); }
	 */
	
	@RequestMapping("/{userId}")
	public List<MovieCatalog> getCatalog(@PathVariable("userId") String userId){
		Movie movie =restTemplate.getForObject(globalProperties.getMovieInfoURL()+userId, Movie.class);
		MovieRating rating =restTemplate.getForObject(globalProperties.getMovieRatingURL()+userId, MovieRating.class);
		return Arrays.asList(
				new MovieCatalog("m","123",10),
				new MovieCatalog(movie.getMovieId(), movie.getName(),rating.getRating() ));
				
		}
}
