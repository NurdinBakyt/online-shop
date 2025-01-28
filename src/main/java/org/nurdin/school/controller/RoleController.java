package org.nurdin.school.controller;

import org.nurdin.school.dto.RoleDTO;
import org.nurdin.school.entity.RoleEntity;
import org.nurdin.school.service.RoleService;
import org.nurdin.school.util.RolesMapper;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/role")
public class RoleController {
    private final RoleService roleService;
    private final RolesMapper rolesMapper;

    public RoleController(RoleService roleService, RolesMapper rolesMapper) {
        this.roleService = roleService;
        this.rolesMapper = rolesMapper;
    }

    @GetMapping("/get-role-by-id/{id}")
    public ResponseEntity<RoleEntity> getRoleById(@PathVariable Long id) {
        return ResponseEntity.ok(roleService.findById(id));
    }
    @GetMapping("/get-all-roles")
    public ResponseEntity<List<RoleDTO>> getAllRoles() {
        return ResponseEntity.ok(RolesMapper.roleEntitySetToDTOSet(roleService.findAll()));
    }
}