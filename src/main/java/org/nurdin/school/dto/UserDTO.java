package org.nurdin.school.dto;


import io.swagger.v3.oas.annotations.media.Schema;
import org.nurdin.school.entity.BaseEntity;

@Schema(description = "Dto для внутренней системы с полным наборам полей")
public class UserDTO extends BaseEntity {
    private String email;
    private String password;
    @Schema(description = "1)Гость " + "2)Родитель " + " 3) Сотрудник школы")
    private RoleDTO role;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public RoleDTO getRole() {
        return role;
    }

    public void setRole(RoleDTO role) {
        this.role = role;
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
                "id=" + id +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roles=" + role +
                '}';
    }
}