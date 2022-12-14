package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Product;
@Repository("productRepository")
public interface ProductRepository extends CrudRepository<Product, Integer>{

}
