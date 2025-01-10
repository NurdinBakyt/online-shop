package org.nurdin.school.controller;

import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.service.UserService;
import org.nurdin.school.util.UserDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public ResponseEntity<UserDtoResponse> addUser(@RequestBody UserDTO userDTO) {
        userService.register(UserDTOMapper.userDTOtoEntity(userDTO));
        return ResponseEntity.ok(UserDTOMapper.userDtoToResponse(userDTO));
    }

    @GetMapping("/{email}")
    public ResponseEntity<UserDtoResponse> getUserByEmail(@PathVariable String email)
    {
        UserDTO user = UserDTOMapper.userEntityToDTO(userService.findByEmail(email));
        return ResponseEntity.ok(UserDTOMapper.userDtoToResponse(user));
    }

    @GetMapping(value = "/get-all-users")
    public List<UserDtoResponse> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return users.stream()
                .map(userDTOMapper::userEntityToDTOResponse)
                .toList();
    }

}