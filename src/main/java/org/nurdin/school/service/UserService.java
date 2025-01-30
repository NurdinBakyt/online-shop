package org.nurdin.school.service;

import org.nurdin.school.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity register(UserEntity user);
    UserEntity findById(Long id);
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
    UserEntity updateUserName(String username, String newUsername);
    UserEntity updateUserPassword(String email, String newPassword);
    UserEntity deleteUser(Long id);
    UserEntity deleteUserByName(String username);
    UserEntity deleteUserByEmail(String email);
    List<UserEntity> getAllUsers();
}