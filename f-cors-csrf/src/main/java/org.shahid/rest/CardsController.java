package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CardsController {
    @GetMapping("/cards/{accountNumber}")
    public String getCardDetails(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello please find your card details against account number " + accountNumber;
    }
}
