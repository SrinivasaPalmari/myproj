package com.example.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entities.Account;
import com.example.repositories.AccountRepository;

@Service("accountService")
@Transactional
public class AccountServiceImpl implements AccountService{
	@Autowired
	private AccountRepository accountRepository;

	@Override
	public Account create(Account account) {
		// TODO Auto-generated method stub
		return accountRepository.save(account);
	}

	@Override
	public Account login(String username, String password) {
		// TODO Auto-generated method stub
		return accountRepository.findByUsernameAndPassword(username, password);
	}

	@Override
	public Account findByUsername(String username) {
		// TODO Auto-generated method stub
		return accountRepository.findByUsername(username);
	}
	
}
