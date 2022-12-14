package com.example.controllers;

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
import com.example.services.AccountService;


@Controller
@RequestMapping("account")
public class AccountController {
	@Autowired
	private AccountService accountService;
	
	@RequestMapping(value="login", method = RequestMethod.GET)
	public String login() {
		return "account/login";
	}
	@RequestMapping(value="login", method = RequestMethod.POST)
	public String login(
			@RequestParam("username") String username,
			@RequestParam("password") String password,
			HttpSession session,
			ModelMap modelMap ) {
		Account account = accountService.login(username, password);
		if(account==null) {
			modelMap.put("error", "Invalid Account");
			return "account/login";
		}else {
			session.setAttribute("username", username);
			return "redirect:/product";
		}
		
	}
	@RequestMapping(value="signup", method = RequestMethod.GET)
	public String signup(ModelMap modelMap) {
		modelMap.put("account",new Account());
		return "account/signup";
	}
	@RequestMapping(value="signup", method = RequestMethod.POST)
	public String signup(@ModelAttribute("account")Account account) {
		accountService.create(account);
		return "redirect:/account/login";
	}
	
}
