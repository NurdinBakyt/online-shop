package org.nurdin.school.dto.roles;

import org.nurdin.school.dto.Classes;

import java.util.List;

public class ClassTeacherDTO {
    private Long id;
    private String name;
    private String surname;
    private int age;
    /**
     * Список классов у кл.руководителя.
     * Я сделал List т.к у учителя может быть не один класс
     */
    private List<Classes> classes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }
}
