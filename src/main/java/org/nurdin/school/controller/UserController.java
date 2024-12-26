package org.nurdin.school.controller;

import org.nurdin.school.dao.UserDao;
import org.nurdin.school.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    private final UserDao userDao;

    @Autowired
    public UserController(UserDao userDao) {
        this.userDao = userDao;
    }

    @GetMapping(value = "/getUser")
    public UserDto getUser(@RequestParam Long userId) {
        return new UserDto();
    }
    @PostMapping(value = "/addUser")
    public UserDto addUser(@RequestBody UserDto userDto) {
        UserDto user = new UserDto();
        user.setId(userDto.getId());
        user.setEmail("nrejf");
        user.setPassword("123456");
        return user;
    }
}