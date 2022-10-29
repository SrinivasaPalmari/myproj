package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Review;
@Repository("reviewRepository")
public interface ReviewRepository extends CrudRepository<Review, Integer>{

}
