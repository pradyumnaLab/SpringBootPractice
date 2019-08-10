package com.pk.movieinfoservice.Model;

public class Movie {
	
	private int movieId;
	private String name;
	private String releaseYear;
	
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(String releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Movie(int movieId, String name, String releaseYear) {
		super();
		this.movieId = movieId;
		this.name = name;
		this.releaseYear=releaseYear;
	}
	
	public Movie() {};

}
