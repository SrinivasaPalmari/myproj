package com.example.services;

import com.example.entities.Account;

public interface AccountService {
	public Account create(Account account);
	
	public Account login(String username, String password);
	
	public Account findByUsername(String username);
}
