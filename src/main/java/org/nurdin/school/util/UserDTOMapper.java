package org.nurdin.school.util;

import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.RoleEntity;
import org.nurdin.school.entity.UserEntity;
import org.springframework.stereotype.Service;


@Service
public class UserDTOMapper {
    /**
     * Метод apply,делает mapping userDto в responseDto. тоесть то что мы отдаем пользователю и я реализую interface Function.
     * Чтобы в userController гибко выводить данные о user
     */
    public UserDtoResponse userDtoToResponse(UserEntity userEntity) {
        return new UserDtoResponse(
                userEntity.getId(),
                userEntity.getUsername(),
                userEntity.getEmail(),
                userEntity.getAge(),
                userEntity.getRoles().stream()
                        .map(RoleEntity::getRoleTitle)
                        .toList(),
                userEntity.getPhoneNumber()
        );
    }

    /**
     * Этот метод наоборот делает map в DTO
     */
    public static UserDtoResponse userResponseToDTO(UserEntity userEntity) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userEntity.getId());
        userDtoResponse.setUsername(userEntity.getUsername());
        userDtoResponse.setEmail(userEntity.getEmail());
        userDtoResponse.setAge(userEntity.getAge());
        userDtoResponse.setRole(userEntity.getRoles().stream().map(RoleEntity::getRoleTitle).toList());
        userDtoResponse.setPhoneNumber(userEntity.getPhoneNumber());
        return userDtoResponse;
    }


}
