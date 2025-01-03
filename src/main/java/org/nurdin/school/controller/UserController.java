package org.nurdin.school.controller;

import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.service.UserService;
import org.nurdin.school.util.UserDTOMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    private final UserService userService;
    private final UserDTOMapper userDTOMapper;

    public UserController(UserService userService, UserDTOMapper userDTOMapper) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
    }


    @PostMapping(value = "/register")
    public ResponseEntity<String> addUser(@RequestBody UserEntity userEntity) {
        Optional<UserEntity> user = userService.findByEmail(userEntity.getEmail());
        if (user.isPresent()) {
            return ResponseEntity
                    .status(HttpStatus.CONFLICT)
                    .body("Такой пользователь уже есть!");
        }
        userService.save(userEntity);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .body("Пользователь успешно добавлен!");
    }

    @GetMapping("/{username}")
    public ResponseEntity<Object> getUserByUsername(@PathVariable String username) {
        Optional<UserEntity> userEntityOptional = userService.findByUsername(username);

        if (userEntityOptional.isPresent()) {
            UserDtoResponse userDtoResponse = userDTOMapper.userDtoToResponse(userEntityOptional.get());
            return ResponseEntity.ok(userDtoResponse);
        } else {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Такой пользователь не найден!");
        }
    }

    @GetMapping(value = "/getAllUsers")
    public List<UserDtoResponse> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();

        return users.stream()
                .map(userDTOMapper::userDtoToResponse)
                .toList();
    }
}