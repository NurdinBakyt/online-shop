package org.nurdin.school.dto;


import org.nurdin.school.entity.BaseEntity;
import org.nurdin.school.enums.UserStatus;

import java.time.LocalDateTime;
import java.util.Set;

public class UserDTO {
    private Long id;
    private String username;
    private String email;
    private String password;
    private Set<RoleDTO> roles;
    private UserStatus userStatus;
    private LocalDateTime createdAt;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt() {
        this.createdAt = LocalDateTime.now();
    }

    public UserStatus getUserStatus() {
        return userStatus;
    }
    public void setUserStatus(UserStatus userStatus) {
        this.userStatus = userStatus;
    }
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Set<RoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(Set<RoleDTO> roles) {
        this.roles = roles;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserDTO{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + roles +
                ", userStatus=" + userStatus +
                ", localDateTime=" + createdAt +
                ", id=" + id +
                '}';
    }
}