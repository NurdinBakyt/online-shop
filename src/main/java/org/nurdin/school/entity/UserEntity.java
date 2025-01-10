package org.nurdin.school.entity;

import org.nurdin.school.dto.Role;


public class UserEntity  {
    private Long id;
    private String email;
    private String password;
    private Role roles;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    public Role getRoles() {
        return roles;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                ", id=" + id +
                '}';
    }
}
