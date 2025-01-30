package org.nurdin.school.service;

import org.nurdin.school.entity.RoleEntity;

import java.util.List;

public interface RoleService {
    RoleEntity findById(Long id);

    List<RoleEntity> findAll();

    void addRoleToUserByTitle(String roleName, Long userId);

    RoleEntity save(RoleEntity role);

    void delete(Long user_id,Long role_id);

    void deleteByRoleId(Long roleId);

    void deleteByRoleTitle(String roleTitle);

    RoleEntity addNewRole(RoleEntity role);
}
