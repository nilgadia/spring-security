package org.shahid.mapper;

import org.mapstruct.Mapper;
import org.shahid.dto.UsersDto;
import org.shahid.entity.Users;

import java.util.List;

@Mapper(componentModel = "spring")
public interface UserMapper {
    Users toEntity(UsersDto dto);

    UsersDto toDto(Users entity);

    List<UsersDto> toDtos(List<Users> entities);
}
