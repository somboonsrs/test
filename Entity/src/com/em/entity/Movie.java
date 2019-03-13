package com.em.entity;

public class Movie {
	
	private String movieId;
	private String name;
	
	public Movie() {
		///////////////////
	}
	
	public Movie(String movieId, String name) {
		super();
		this.movieId = movieId;
		this.name = name;
	}
	
	public String getMovieId() {
		return movieId;
	}
	public void setMovieId(String movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Movie [movieId=" + movieId + ", name=" + name + "]";
	}
}
