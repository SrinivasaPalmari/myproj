package com.example.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.entities.Account;
@Repository("accountRepository")
public interface AccountRepository extends CrudRepository<Account, Integer>{
	
	public Account findByUsernameAndPassword(String username, String password);
	public Account findByUsername(String username);
}
