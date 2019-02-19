package com.em.cotroller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.em.entity.MovieRating;

@RestController
@RequestMapping("/mrating")
public class MovieRatingDataController {

		@RequestMapping("/{movieId}")
		public MovieRating getRating(@PathVariable(name="movieId") String movieId) {
			return new MovieRating (movieId,10);
		}
		
}
