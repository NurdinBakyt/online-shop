package org.nurdin.school.controller;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.dto.response.UserDtoResponse;
import org.nurdin.school.entity.RoleEntity;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.repository.RoleRepository;
import org.nurdin.school.service.RoleService;
import org.nurdin.school.service.UserService;
import org.nurdin.school.util.UserDTOMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping(value = "api/v1/user")
public class UserController {
    private final UserService userService;
    private final UserDTOMapper userDTOMapper;
    private final RoleService roleService;
    private final RoleRepository roleRepository;


    public UserController(UserService userService, UserDTOMapper userDTOMapper, RoleService roleService, RoleRepository roleRepository) {
        this.userService = userService;
        this.userDTOMapper = userDTOMapper;
        this.roleService = roleService;
        this.roleRepository = roleRepository;
    }


    @PostMapping(value = "/register")
    @Operation(summary = "Метод для регистрации новых пользователей", description = "Как можно судить пр названию, метод для регистрации новых пользователей ")
    public UserDtoResponse addUser(@RequestBody UserDTO userDTO) {
        return UserDTOMapper.userEntityToDTOResponse(
                userService.register(UserDTOMapper.userDTOtoEntity(userDTO))
        );
    }


    @GetMapping("email")
    @Operation(summary = "Получение пользователей по email", description = " Исключительно поиск по email")
    public ResponseEntity<UserDtoResponse> getUserByEmail(@RequestBody String email) {
        return ResponseEntity.ok(UserDTOMapper.userEntityToDTOResponse(userService.findByEmail(email)));
    }

    @PostMapping("/delete")
    @Operation(summary = "Удаление пользователей")
    public ResponseEntity<UserDtoResponse> deleteUser(@RequestParam Long id) {
        return ResponseEntity.ok(UserDTOMapper.userEntityToDTOResponse(userService.deleteUser(id)));
    }

    @GetMapping(value = "/get-all-users")
    @Operation(summary = "Получение всех пользователей")
    public List<UserDtoResponse> getAllUsers() {
        List<UserEntity> users = userService.getAllUsers();
        return users.stream()
                .map(UserDTOMapper::userEntityToDTOResponse)
                .toList();
    }

    @PostMapping("/add-role-to-user-by-title")
    @Operation(summary = "Добавление роли по названию ")
    public ResponseEntity<String> addRoleByTitle(@RequestParam String title, @RequestParam Long user_id) {
        Optional<UserEntity> userDTO = userService.findById(user_id);

        roleService.addRoleToUserByTitle(title, user_id);
        return ResponseEntity.ok("Роль '" + title + "' добавлена пользователю: " + userDTO.get().getUsername());
    }
    @DeleteMapping("/delete-user-role")
    @Operation(summary = "Удаление роли пользователя", description = "Работает по id роли, то есть удаляется не пользователь а именно его роль, данные пользователя должны остаться ")
    public ResponseEntity<String> deleteUserRole(@RequestParam Long user_id, @RequestParam Long role_id) {
        Optional<UserEntity> userDTO = userService.findById(user_id);
        Optional<RoleEntity> roleDTO = roleRepository.findById(role_id);

        roleService.delete(user_id,role_id);
        return ResponseEntity.ok("Удалена роль " + roleDTO.get().getTitle() + " ,Пользователя: " + userDTO.get().getUsername());
    }
}
