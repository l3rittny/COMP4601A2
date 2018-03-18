package edu.carleton.comp4601.models;

import java.util.ArrayList;
import java.util.HashMap;

public class Movie {
	String genre;
	String title;
	//<uname, review>
	HashMap<String, Review> reviews = new HashMap<String, Review>();
	ArrayList<String> usersAccessed = new ArrayList<String>();
	//a shows who, then p shows review.

	public Movie(String title, String genre) {
		this.genre = genre;
		this.title = title;
	}
	
	public String getGenre() {
		return genre;
	}


	public void setGenre(String genre) {
		this.genre = genre;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public HashMap<String, Review> getReviews() {
		return reviews;
	}
	
	public void setReviews(HashMap<String, Review> reviews) {
		this.reviews = reviews;
	}
	
	
	public ArrayList<String> getUsersAccessed() {
		return usersAccessed;
	}

	public void setUsersAccessed(ArrayList<String> usersAccessed) {
		this.usersAccessed = usersAccessed;
	}

	
}
