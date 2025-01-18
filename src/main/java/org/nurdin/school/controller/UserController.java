package org.nurdin.school.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.persistence.Table;
import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.service.UserService;
import org.nurdin.school.util.UserDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Tag(name = "User controller",description = "Точка доступа для работы с пользователями: Регистрация,обновление user,и выдачи ролей и т.д")
@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    private final UserService userService;
    private final UserDTOMapper userDTOMapper;

    public UserController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }

    /**
     * Данная точка доступа нужна для регистрации новых пользователей в систему.
     * Получаем от пользователя данные, эти данные передаём в бизнес логику
     * @param userDTO - это объект для получения данных от пользователя
     *                получаемые данные (почту пользователя, пароль, роли)
     *                роль может быть (родитель или сотрудник)
     * @return - должны вернуть в качестве ответа (почту пользователя, пароль, роли)
     */
    @PostMapping(value = "/register")
    /**
     * Этот метод нежен для регистрации
     */
    @Operation(summary = "Регистрация",description = "")
    public UserDtoResponse addUser(@RequestBody UserDTO userDTO /* получаем двнные от пользавателя */ ) {
        return userDTOMapper.userEntityToDTOResponse(userService.register(UserDTOMapper.userDTOtoEntity(userDTO /**/)));
    }
    @Operation(summary = "Получение пользователя ", description = "Метод позволяет получать пользователя по заданной email почте")
    @GetMapping("/{email}")
    public ResponseEntity<UserDtoResponse> getUserByEmail(@PathVariable String email)
    {

        UserEntity requestDataBase = userService.findByEmail(email);

        UserDtoResponse userDtoResponse = userDTOMapper.userEntityToDTOResponse(requestDataBase);

        return ResponseEntity.ok(userDtoResponse);

//        return ResponseEntity.ok(UserDTOMapper.userDtoToResponse(userService.findByEmail(email)));
    }

    @Operation(summary = "Получение всех пользователей ")
    @GetMapping(value = "/get-all-users")
    public List<UserDtoResponse> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return users.stream()
                .map(userDTOMapper::userEntityToDTOResponse)
                .toList();
    }

}