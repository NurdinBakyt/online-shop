package org.nurdin.school.entity;

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