package org.shahid.service;

import lombok.AllArgsConstructor;
import org.shahid.dto.UsersDto;
import org.shahid.mapper.UserMapper;
import org.shahid.repository.UserRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UserService {

    private final UserMapper converter;
    private final UserRepository repository;

    public UsersDto getUserById(Integer id) {
        return converter.toDto(repository.findById(id).get());
    }

    public UsersDto getUserByUsername(String username) {
        return converter.toDto(repository.findByUsername(username));
    }

    public List<UsersDto> getAllUsers() {
        return converter.toDtos(repository.findAll());
    }

    public UsersDto createUser(UsersDto user) {
        return converter.toDto(repository.save(converter.toEntity(user)));
    }

    public UsersDto updateUser(Integer userId, UsersDto user) {
        return converter.toDto(repository.save(converter.toEntity(user)));
    }

    public void deleteUser(Integer id) {
        repository.deleteById(id);
    }
}
