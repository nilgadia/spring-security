package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {
    @GetMapping("/accounts/{accountNumber}")
    public String getAccountDetails(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello please fine your account details account number is  " + accountNumber;
    }
}
