package org.nurdin.school.controller;

import org.nurdin.school.dto.UserDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {

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
        return user;
    }
}