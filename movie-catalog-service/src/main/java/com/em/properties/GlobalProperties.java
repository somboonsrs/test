package com.em.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("file:d:/properties/url.properties")

public class GlobalProperties {
	
	@Value("${movieInfoURL}")
	private String movieInfoURL;
	
	@Value("${movieRatingURL}")
	private String movieRatingURL;

	public String getMovieInfoURL() {
		return movieInfoURL;
	}

	public void setMovieInfo(String movieInfo) {
		this.movieInfoURL = movieInfo;
	}

	public String getMovieRatingURL() {
		return movieRatingURL;
	}

	public void setMovieRatingURL(String movieRatingURL) {
		this.movieRatingURL = movieRatingURL;
	}
}
