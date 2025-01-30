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
    public UserDtoResponse addUser(@RequestBody UserDTO userDTO) {
        return UserDTOMapper.userEntityToDTOResponse(
                userService.register(UserDTOMapper.userDTOtoEntity(userDTO))
        );
    }

    @GetMapping("/get-by-email")
    public ResponseEntity<UserDtoResponse> getUserByEmail(@RequestBody String email) {
        return ResponseEntity.ok(UserDTOMapper.userEntityToDTOResponse(userService.findByEmail(email)));
    }

    @GetMapping("/get-by-id")
    public ResponseEntity<UserDtoResponse> getUserById(@RequestBody String id) {
        return ResponseEntity.ok(UserDTOMapper.userEntityToDTOResponse(userService.findById(Long.parseLong(id))));
    }

    @GetMapping("/get-by-name")
    public ResponseEntity<UserDtoResponse> getUserName(@RequestParam String name){
        return ResponseEntity.ok(UserDTOMapper.userEntityToDTOResponse(userService.findByUsername(name)));
    }

    @GetMapping(value = "/get-all-users")
    public List<UserDtoResponse> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return users.stream()
                .map(UserDTOMapper::userEntityToDTOResponse)
                .toList();
    }

    @PutMapping("/update-user-name")
    public ResponseEntity<UserDtoResponse> updateUserName(@RequestBody String userName, String newUsername) {
        UserDtoResponse user = UserDTOMapper.userEntityToDTOResponse(userService.updateUserName(userName, newUsername));
        return ResponseEntity.ok(user);
    }

    @PutMapping("/update-user-password")
    public ResponseEntity<UserDtoResponse> updatePassword(@RequestBody String email, String newPassword) {
        UserDtoResponse user = UserDTOMapper.userEntityToDTOResponse(userService.updateUserPassword(email,newPassword));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete-user-by-id/{id}")
    public ResponseEntity<UserDtoResponse> deleteUserById(@PathVariable Long id) {
        UserDtoResponse user = UserDTOMapper.userEntityToDTOResponse(userService.findById(id));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete-user-by-name")
    public ResponseEntity<UserDtoResponse> deleteUserByName(@RequestBody String name) {
        UserDtoResponse user = UserDTOMapper.userEntityToDTOResponse(userService.findByUsername(name));
        return ResponseEntity.ok(user);
    }

    @DeleteMapping("/delete-user-by-email")
    public ResponseEntity<UserDtoResponse> deleteUserByEmail(@RequestBody String email) {
        UserDtoResponse user = UserDTOMapper.userEntityToDTOResponse(userService.findByEmail(email));
        return ResponseEntity.ok(user);
    }




}