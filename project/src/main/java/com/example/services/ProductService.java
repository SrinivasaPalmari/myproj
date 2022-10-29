package com.example.services;

import java.util.Optional;

import com.example.entities.Product;

public interface ProductService {
	public Iterable<Product> findAll();
	
	public Optional<Product> find(int id);
}
