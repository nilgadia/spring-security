package org.shahid.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.eazybytes.model.Accounts;
import com.eazybytes.model.Customer;
import com.eazybytes.repository.AccountsRepository;

@RestController
public class AccountController {
	
	@Autowired
	private AccountsRepository accountsRepository;
	
	@PostMapping("/myAccount")
	public Accounts getAccountDetails(@RequestBody Customer customer) {
		Accounts accounts = accountsRepository.findByCustomerId(customer.getId());
		if (accounts != null ) {
			return accounts;
		}else {
			return null;
		}
	}

}
