package com.example.entities;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Table;

@Entity
@Table(name="review")
public class Review implements java.io.Serializable{
	
	private Integer id;
	private Account account;
	private Product product;
	private String content;
	private Date datepost;
	private float rating;

	public Review() {}

	public Review(Integer id, Account account, Product product, String content, Date datepost, float rating) {
		super();
		this.id = id;
		this.account = account;
		this.product = product;
		this.content = content;
		this.datepost = datepost;
		this.rating = rating;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Account getAccount() {
		return account;
	}

	public void setAccount(Account account) {
		this.account = account;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getDatepost() {
		return datepost;
	}

	public void setDatepost(Date datepost) {
		this.datepost = datepost;
	}

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	@Override
	public String toString() {
		return "Review [id=" + id + ", account=" + account + ", product=" + product + ", content=" + content
				+ ", rating=" + rating + "]";
	}
	
	
}
