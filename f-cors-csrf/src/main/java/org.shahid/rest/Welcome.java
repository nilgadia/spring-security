package org.shahid.rest;

import lombok.AllArgsConstructor;
import org.shahid.service.UserService;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class Welcome {

    private final PasswordEncoder passwordEncoder;
    private final UserService userService;

    @GetMapping("/welcome")
    public String greeting(@RequestParam(name = "name") String userName) {
        return "Hello " + userService.getUserByUsername(userName).getUsername() + " welcome to our spring security demo, " +
                "please find your password for login" + passwordEncoder.encode("Hello@123");
    }
}
    