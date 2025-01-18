package org.nurdin.school.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "roles")
public class RoleEntity extends BaseEntity {
    private String roleTitle;

    public String getRoleTitle() {
        return roleTitle;
    }

    public RoleEntity setRoleTitle(String roleTitle) {
        this.roleTitle = roleTitle;
        return this;
    }
}