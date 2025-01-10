package org.nurdin.school.util;

import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.RoleEntity;
import org.nurdin.school.entity.UserEntity;
import org.springframework.stereotype.Service;


@Service
public class UserDTOMapper {
    //   этот метод,делает mapping userDto в responseDto. тоесть то что мы отдаем пользователю и здесь я не вывожу пароль ведь
    //   пользователю этого не нужно показывать.
    //   Чтобы в userController гибко выводить данные о user
    public static UserDtoResponse userDtoToResponse(UserDTO userDTO) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userDTO.getId());
        userDtoResponse.setRoles(userDTO.getRoles());
        userDtoResponse.setEmail(userDTO.getEmail());
        return userDtoResponse;
    }
    // Этот метод наоборот делает map в DTO
    public static UserDtoResponse userResponseToDTO(UserDTO userDTO) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userDTO.getId());
        userDtoResponse.setEmail(userDTO.getEmail());
        userDtoResponse.setRoles(userDTO.getRoles());
        return userDtoResponse;
    }
    // Этот метод делает маппинг, DTO в entity
    public static UserDTO userEntityToDTO(UserEntity userEntity) {
        System.out.println("Mapping user entity: " + userEntity);
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setRoles(userEntity.getRoles());
        System.out.println("Mapped user DTO: " + userDTO);
        return userDTO;
    }
    // А этот метод наоборот Entity в DTO
    public static UserEntity userDTOtoEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(userDTO.getId());
        userEntity.setEmail(userDTO.getEmail());
        userEntity.setRoles(userDTO.getRoles());
        return userEntity;
    }
    // А этот метод entity в dtoResponse
    public UserDtoResponse userEntityToDTOResponse(UserEntity userEntity) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userEntity.getId());
        userDtoResponse.setEmail(userEntity.getEmail());
        userDtoResponse.setRoles(userEntity.getRoles());
        System.out.println("Mapped user DTO: " + userDtoResponse);
        return userDtoResponse;
    }
}
