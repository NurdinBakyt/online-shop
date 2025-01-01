package org.nurdin.school.dto.response;

import java.util.List;

public class UserDtoResponse {
    private Long id;
    private String username;
    private String email;
    private int age;
    private List<String> role;
    private String phoneNumber;

    // Конструктор с параметрами
    public UserDtoResponse(Long id, String username, String email, int age, List<String> role, String phoneNumber) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.age = age;
        this.role = role;
        this.phoneNumber = phoneNumber;
    }

    // Пустой конструктор (нужен для Spring, Jackson и т.д.)
    public UserDtoResponse() {}

    // Геттеры и сеттеры
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<String> getRole() {
        return role;
    }

    public void setRole(List<String> role) {
        this.role = role;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}