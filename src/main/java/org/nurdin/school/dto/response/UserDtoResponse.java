package org.nurdin.school.dto.response;

import org.nurdin.school.dto.RoleDTO;


public class UserDtoResponse {
    private Long id;
    private String email;
    private RoleDTO roles;

    // Конструктор с параметрами
    public UserDtoResponse(Long id, String email, RoleDTO roles) {
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

    public RoleDTO getRoles() {
        return roles;
    }

    public void setRoles(RoleDTO roles) {
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