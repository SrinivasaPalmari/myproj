package com.example.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Product;
import com.example.repositories.ProductRepository;

@Service("productService")
@Transactional
public class ProductServiceImpl implements ProductService{
	@Autowired
	private ProductRepository productRepository;
	@Override
	public Iterable<Product> findAll(){
		return productRepository.findAll();
	}
	@Override
	public Optional<Product> find(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(null);
	}
	
}
