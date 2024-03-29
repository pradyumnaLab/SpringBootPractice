package com.pk.moviecatalogservice.Model;

public class CatalogItem {

	private String name;
	private String releaseYear;
	private int rating;
	
	
	
	public CatalogItem(String name, String releaseYear, int rating) {
		super();
		this.name = name;
		this.releaseYear = releaseYear;
		this.rating = rating;
	}
	
	public CatalogItem() {};
	
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

	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	
}
