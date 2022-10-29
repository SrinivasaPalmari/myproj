package com.example.controllers;

import java.util.Date;
import java.util.Optional;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.entities.Account;
import com.example.entities.Product;
import com.example.entities.Review;
import com.example.services.AccountService;
import com.example.services.ProductService;
import com.example.services.ReviewService;

@Controller
@RequestMapping("product")
public class ProductController {
	@Autowired
	private ProductService productService;
	@Autowired
	private AccountService accountService;
	@Autowired
	private ReviewService reviewService;
	
	@RequestMapping(method = RequestMethod.GET)
	public String index(ModelMap modelMap) {
		modelMap.put("products", productService.findAll());
		return "product/index";
	}
	
	@RequestMapping(value="detail/{id}",method = RequestMethod.GET)
	public String detail(@PathVariable("id")int id, ModelMap modelMap) {
		Optional<Product> product=productService.find(id);
		modelMap.put("product", product);
		Review review = new Review();
		modelMap.put("review", review);
		return "product/detail";
	}
	
	@RequestMapping(value="sendReview", method = RequestMethod.POST)
	public String sendReview(
			@ModelAttribute("review")Review review, 
			@RequestParam("hdrating") float hdrating, 
			HttpSession session) {
			String username = session.getAttribute("username").toString();
			review.setAccount(accountService.findByUsername(username));
			review.setDatepost(new Date());
			review.setRating(hdrating);
			reviewService.create(review);
			return "redirect:/product/detail/" + review.getProduct().getId();
	}
	
}
