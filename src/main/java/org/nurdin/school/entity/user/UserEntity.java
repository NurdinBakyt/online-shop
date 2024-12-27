package org.nurdin.school.entity.user;

import org.nurdin.school.entity.BaseEntity;
import org.nurdin.school.entity.role.RoleEntity;

import java.util.List;

public class UserEntity extends BaseEntity {
    private String username;
    private String password;
    private String email;
    private List<RoleEntity> roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public List<RoleEntity> getRoles() {
        return roles;
    }

    public void setRoles(List<RoleEntity> roles) {
        this.roles = roles;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
