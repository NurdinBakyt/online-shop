package org.nurdin.school.dto.response;

import io.swagger.v3.oas.annotations.media.Schema;
import org.nurdin.school.dto.RoleDTO;

@Schema(description = "Dto с отсутствующим полям пароля, для ответа к пользователю  ")
public class UserDtoResponse {
    private Long id;
    private String email;
    @Schema(description = "1)Гость " + "2)Родитель " + " 3) Сотрудник школы")
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