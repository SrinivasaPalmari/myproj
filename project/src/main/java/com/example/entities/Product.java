package com.example.entities;

import java.util.HashSet;
import java.util.Set;

public class Product implements java.io.Serializable{
	
	private Integer id;
	private String name;
	private double price;
	private String photo;
	private Set<Review> reviews = new HashSet<Review>(0);
	
	public Product() {}

	public Product(Integer id, String name, double price, String photo, Set<Review> reviews) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
		this.photo = photo;
		this.reviews = reviews;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPhoto() {
		return photo;
	}

	public void setPhoto(String photo) {
		this.photo = photo;
	}

	public Set<Review> getReviews() {
		return reviews;
	}

	public void setReviews(Set<Review> reviews) {
		this.reviews = reviews;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", price=" + price + ", photo=" + photo + ", reviews=" + reviews
				+ "]";
	}
	
	
}
