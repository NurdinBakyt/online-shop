package org.nurdin.school.dto.response;

import org.nurdin.school.dto.Role;


public class UserDtoResponse {
    private Long id;
    private String email;
    private Role roles;

    // Конструктор с параметрами
    public UserDtoResponse(Long id, String email, Role roles) {
        this.id = id;
        this.email = email;
        this.roles = roles;
    }

    // Пустой конструктор (нужен для Spring, Jackson и т.д.)
    public UserDtoResponse() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Role getRoles() {
        return roles;
    }

    public void setRoles(Role roles) {
        this.roles = roles;
    }

    @Override
    public String toString() {
        return "UserDtoResponse{" +
                "id=" + id +
                ", email='" + email + '\'' +
                ", roles=" + roles +
                '}';
    }
}