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
    public ResponseEntity<UserStatus[]> getStatus() {
        return ResponseEntity.ok(UserStatus.values());
    }
    @GetMapping("/user-register-roles")
    public ResponseEntity<RolesRegisterEnum[]> getUserRegisterRoles() {
        return ResponseEntity.ok(RolesRegisterEnum.values());
    }
    @GetMapping("/user-roles")
    public ResponseEntity<RolesEnum[]> getUserRoles() {
        return ResponseEntity.ok(RolesEnum.values());
    }
}