package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NoticesController {
    @GetMapping("/notices/{accountNumber}")
    public String getNotices(@PathVariable(name = "accountNumber") String accountNumber) {
        return "Hello please find your notices against account number " + accountNumber;
    }
}
