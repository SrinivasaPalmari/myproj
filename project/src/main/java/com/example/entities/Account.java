package com.example.entities;

import java.util.HashSet;
import java.util.Set;

public class Account implements java.io.Serializable {
	
	private Integer id;
	private String username;
	private String password;
	private String fullname;
	private Set<Review> reviews = new HashSet<Review>(0);
	
	public Account() {}

	public Account(Integer id, String username, String password, String fullname, Set<Review> reviews) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
		this.fullname = fullname;
		this.reviews = reviews;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getFullname() {
		return fullname;
	}

	public void setFullname(String fullname) {
		this.fullname = fullname;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Account [id=" + id + ", username=" + username + ", password=" + password + ", fullname=" + fullname
				+ ", reviews=" + reviews + "]";
	}
	
	
}
