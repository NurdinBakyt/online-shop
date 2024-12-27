package org.nurdin.school.util;

import org.nurdin.school.dto.UserDto;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.user.UserEntity;

public class UserMapper {
    public static UserEntity mapModelToUserEntity(UserDto userDto) {
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDto.getId());
        userEntity.setUsername(userDto.getUsername());
        userEntity.setPassword(userDto.getPassword());
        return userEntity;
    }
    public static UserDtoResponse mapUserEntityToUserDto(UserEntity userEntity) {
        UserDtoResponse userDto = new UserDtoResponse();
        userDto.setId(userEntity.getId());
        userDto.setEmail(userEntity.getEmail());
        userDto.setName(userDto.getName());
        userDto.setRoles(RolesMapper.toRoleResponseDtoList(userEntity.getRoles()));
        return userDto;
    }
}
