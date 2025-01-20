package org.nurdin.school.dto.response;

public class RoleResponseDto {
    private Long id;
    private String title;

    public RoleResponseDto(Long id, String title) {
        this.id = id;
        this.title = title;
    }

    public RoleResponseDto() {
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Long getRole() {
        return id;
    }

    public void setRole(Long id) {
        this.id = id;
    }
}
