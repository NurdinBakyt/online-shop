package org.nurdin.school.dto.classes;

import org.nurdin.school.dto.roles.ClassTeacher;
import org.nurdin.school.dto.roles.Student;

import java.util.List;

public class Classes {
    private Long id;
    /**
     * Это поле классного руководителя
     */
    private ClassTeacher classTeacher;
    /**
     * Это поле список студентов в классе
     */
    private List<Student> studentList;

    public Classes() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ClassTeacher getClassTeacher() {
        return classTeacher;
    }

    public void setClassTeacher(ClassTeacher classTeacher) {
        this.classTeacher = classTeacher;
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    public void setStudentList(List<Student> studentList) {
        this.studentList = studentList;
    }
}