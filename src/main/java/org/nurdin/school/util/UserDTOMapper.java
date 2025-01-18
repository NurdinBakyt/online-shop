package org.nurdin.school.util;

import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.UserEntity;
import org.springframework.stereotype.Service;


@Service
public class UserDTOMapper {
    /**  этот метод,делает mapping userDto в responseDto. тоесть то что мы отдаем пользователю и здесь я не вывожу пароль ведь
       пользователю этого не нужно показывать.
      Чтобы в userController гибко выводить данные о user
     **/
    public static UserDtoResponse userDtoToResponse(UserEntity userEntity) {

        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userEntity.getId());
        userDtoResponse.setRoles(userEntity.getRoles());
        userDtoResponse.setEmail(userEntity.getEmail());
        return userDtoResponse;
    }
    // Этот метод наоборот делает map в DTO
//    public static UserDtoResponse userResponseToDTO(UserDTO userDTO) {
//        UserDtoResponse userDtoResponse = new UserDtoResponse();
//        userDtoResponse.setId(userDTO.getId());
//        userDtoResponse.setEmail(userDTO.getEmail());
//        userDtoResponse.setRoles(userDTO.getRoles());
//        return userDtoResponse;
//    }
    // Метод превращает маппинг, DTO в entity
    public static UserDTO userEntityToDTO(UserEntity userEntity) {
        UserDTO userDTO = new UserDTO();
        userDTO.setId(userEntity.getId());
        userDTO.setEmail(userEntity.getEmail());
        userDTO.setPassword(userEntity.getPassword());
        userDTO.setRole(userEntity.getRoles());
        return userDTO;
    }
    // А этот метод наоборот Entity в DTO
    public static UserEntity userDTOtoEntity(UserDTO userDTO){
        UserEntity userEntity = new UserEntity();//создаём экземпляр сущности
        userEntity.setId(userDTO.getId());//передаём в параметр сущности (ID), передаём в параметр dto (ID)
        userEntity.setEmail(userDTO.getEmail());//
        userEntity.setPassword(userDTO.getPassword());
        userEntity.setRoles(userDTO.getRole());
        return userEntity;
    }
    // А этот метод entity в dtoResponse
    public UserDtoResponse userEntityToDTOResponse(UserEntity userEntity) {
        UserDtoResponse userDtoResponse = new UserDtoResponse();
        userDtoResponse.setId(userEntity.getId());
        userDtoResponse.setEmail(userEntity.getEmail());
        userDtoResponse.setRoles(userEntity.getRoles());
        return userDtoResponse;
    }
}
