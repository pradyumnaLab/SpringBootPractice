package com.pk.ratingdataservice.Model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="movierating")
public class Rating {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private int rating;
	
	@Column(name = "userid")
	private int userId;
	
	@Column(name = "movieid")
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
		
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Rating() {
		
	}
}
