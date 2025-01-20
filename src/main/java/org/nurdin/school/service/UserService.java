package org.nurdin.school.service;

import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.entity.UserEntity;

import java.util.List;

public interface UserService {
    UserEntity register(UserEntity user);
    UserEntity findById(Long id);
    UserEntity findByUsername(String username);
    UserEntity findByEmail(String email);
    UserEntity updateUser(UserEntity user);
    UserEntity updatePassword(UserEntity user, String newPassword);
    UserEntity deleteUser(Long id);
    UserEntity deleteUserByUsername(String username);
    UserEntity deleteUserByEmail(String email);
    List<UserEntity> getAllUsers();
}