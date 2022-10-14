package org.shahid.security;

import lombok.AllArgsConstructor;
import org.shahid.dto.UsersDto;
import org.shahid.service.UserService;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

@AllArgsConstructor
public class CustomizeUserDetailsService implements UserDetailsService {

    private final UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        UsersDto user = userService.getUserByUsername(username);
        if (user == null) {
            throw new UsernameNotFoundException("User details not found for the user : " + username);
        }
        return new CustomizeUserDetails(user);
    }

}