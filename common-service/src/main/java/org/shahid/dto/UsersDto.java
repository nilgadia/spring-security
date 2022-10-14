package org.shahid.dto;

import lombok.Getter;
import lombok.Setter;

import java.util.List;


@Getter
@Setter
public class UsersDto {

    private Long id;
    private String username;
    private String password;
    private Boolean enabled;
    private List<AuthoritiesDto> authorities;
}
