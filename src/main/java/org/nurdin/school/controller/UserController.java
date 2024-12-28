package org.nurdin.school.controller;

import org.nurdin.school.dto.UserDto;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.role.RoleEntity;
import org.nurdin.school.service.UserService;
import org.nurdin.school.util.UserDTOMapper;
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

    @GetMapping(value = "/getUser")
    public UserDto getUser(@RequestParam Long userId) {
        return new UserDto();
    }

    @PostMapping(value = "/register")
    public UserDto addUser(@RequestBody UserDto userDto) {
        UserDto user = new UserDto();
        user.setId(userDto.getId());
        user.setEmail("nrejf");
        user.setPassword("123456");
        user.setRole(List.of(new RoleEntity().setRoleTitle("Director")));
        return user;
    }

    @GetMapping(value = "/getAllUsers")
    public List<UserDtoResponse> getAllUsers() {
        return userService.getAllUsers()
                .stream()
                .map(userDTOMapper)
                .toList();
    }
}