package org.nurdin.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import org.nurdin.school.dto.RoleDTO;


@Entity
@Table(name = "users")
public class UserEntity extends BaseEntity {
    private String email;
    private String password;
    private RoleDTO roles;

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

    public void setRoles(RoleDTO roles) {
        this.roles = roles;
    }

    public RoleDTO getRoles() {
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
