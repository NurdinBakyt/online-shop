package org.nurdin.school.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "job_applications")
public class EmployeeEntity extends BaseEntity {
    private String name;
    private String surname;
    private String phone;
    private String photo;
    private String passportPhoto;
    private String resume;
    private int age;

    @ManyToOne
    @JoinColumn(name = "director_id")
    private DirectorEntity directorEntity;

    public EmployeeEntity() {
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    public String getPassportPhoto() {
        return passportPhoto;
    }

    public void setPassportPhoto(String passportPhoto) {
        this.passportPhoto = passportPhoto;
    }

    public String getResume() {
        return resume;
    }

    public void setResume(String resume) {
        this.resume = resume;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public DirectorEntity getDirectorEntity() {
        return directorEntity;
    }

    public void setDirectorEntity(DirectorEntity directorEntity) {
        this.directorEntity = directorEntity;
    }

    @Override
    public String toString() {
        return "EmployeeEntity{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", phone='" + phone + '\'' +
                ", photo='" + photo + '\'' +
                ", passportPhoto='" + passportPhoto + '\'' +
                ", resume='" + resume + '\'' +
                ", age=" + age +
                ", directorEntity=" + directorEntity +
                ", id=" + id +
                '}';
    }
}
