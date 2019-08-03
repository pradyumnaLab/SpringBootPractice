package com.pk.moviecatalogservice.Model;

public class Rating {

	private int rating;
	private int userId;
	private int movieId;
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public Rating(int rating, int userId, int movieId) {
		super();
		this.rating = rating;
		this.userId = userId;
		this.movieId = movieId;
	}
	
public Rating() {
		
	}
}
