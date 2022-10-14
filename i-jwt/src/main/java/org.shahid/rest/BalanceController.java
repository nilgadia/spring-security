package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BalanceController {
    @GetMapping("/balance/{accountNumber}")
    public String getBalanceDetails(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello your balance against account number " + accountNumber + " is 50000$";
    }
}
