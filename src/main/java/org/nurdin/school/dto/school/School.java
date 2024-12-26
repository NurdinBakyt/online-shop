package org.nurdin.school.dto.school;

import org.nurdin.school.dto.classes.Classes;
import org.nurdin.school.dto.roles.Student;
import org.nurdin.school.dto.roles.Teacher;

import java.util.List;

public class School {
    private Long id;
    private String name;
    private String description;
    /**
     * Это поле список классов в школе
     */
    private List<Classes> classes;
    private List<Teacher> teachers;
    private List<Student> students;
    private int classrooms;
    private int floors;
    /**
        Этот класс преднозначен чтобы отпределить школу в системе. Так как школ много!
      Поле classes преднозначено для хранения собственно школ.
     Я сделал их List чтобы работать с ними как список.
     */

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public int getClassrooms() {
        return classrooms;
    }

    public void setClassrooms(int classrooms) {
        this.classrooms = classrooms;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<Classes> getClasses() {
        return classes;
    }

    public void setClasses(List<Classes> classes) {
        this.classes = classes;
    }

    public int getFloors() {
        return floors;
    }

    public void setFloors(int floors) {
        this.floors = floors;
    }
}