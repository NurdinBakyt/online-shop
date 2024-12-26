package org.nurdin.school.dto;


import org.nurdin.school.dto.roles.ClassTeacher;

import java.util.Map;

public enum Role {
    ADMIN,
    DIRECTOR,
    SECRETARY,
    HEAD_TEACHER,
    CLASS_TEACHER,
    TEACHER,
    STUDENT,
    PARENT;

    private Map<String,Role> map;
}