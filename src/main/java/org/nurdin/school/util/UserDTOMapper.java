package org.nurdin.school.util;

import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.role.RoleEntity;
import org.nurdin.school.entity.user.UserEntity;
import org.springframework.stereotype.Service;

import java.util.function.Function;


@Service
public class UserDTOMapper implements Function<UserEntity, UserDtoResponse> {
    public UserDtoResponse apply(UserEntity userEntity) {
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
}
