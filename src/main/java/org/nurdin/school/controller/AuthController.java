package org.nurdin.school.controller;

import org.nurdin.school.enums.RolesEnum;
import org.nurdin.school.enums.RolesRegisterEnum;
import org.nurdin.school.enums.UserStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("api/v1/auth")
public class AuthController {

    @GetMapping("/user-status")
    public ResponseEntity<List<String>> getUserStatuses() {
        List<String> statuses = Arrays.stream(UserStatus.values())
                .map(Enum::name)
                .toList();
        return ResponseEntity.ok(statuses);
    }
    @GetMapping("/user-register-roles")
    public ResponseEntity<List<String>> getUserRegisterRoles() {
        List<String> reg_roles = Arrays.stream(RolesRegisterEnum.values())
                .map(Enum::name)
                .toList();
        return ResponseEntity.ok(reg_roles);
    }
    @GetMapping("/user-roles")
    public ResponseEntity<List<String>> getUserRoles() {
        List<String> reg_roles = Arrays.stream(RolesEnum.values())
                .map(Enum::name)
                .toList();
        return ResponseEntity.ok(reg_roles);
    }
}