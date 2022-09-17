package org.shahid.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoansController {
    @GetMapping("/loans")
    public String getLoansDetails(@RequestParam(name = "input") String userName){
        return "Hello "+userName+" welcome to our spring security demo";
    }
}
