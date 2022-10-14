package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactController {
    @GetMapping("/contact/{accountNumber}")
    public String getContactDetails(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello please find your contact details against account number " + accountNumber;
    }
}
