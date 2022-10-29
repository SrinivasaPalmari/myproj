package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Review;
import com.example.repositories.ReviewRepository;

@Service("reviewService")
@Transactional
public class ReviewServiceImpl implements ReviewService{
	@Autowired
	private ReviewRepository reviewRepository;

	@Override
	public Review create(Review review) {
		// TODO Auto-generated method stub
		return reviewRepository.save(review);
	}
	
}
