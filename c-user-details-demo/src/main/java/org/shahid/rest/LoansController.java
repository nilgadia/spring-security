package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loans/{accountNumber}")
    public String getLoansDetails(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello please find your loan details against account number " + accountNumber;
    }
}
