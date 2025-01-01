package org.nurdin.school.service;

import org.nurdin.school.entity.UserEntity;

import java.util.List;
import java.util.Optional;

public interface UserService {
    UserEntity save(UserEntity user);
    UserEntity findById(Long id);
    Optional<UserEntity> findByUsername(String username);
    Optional<UserEntity> findByEmail(String email);
    UserEntity updateUser(UserEntity user);
    UserEntity updatePassword(UserEntity user, String newPassword);
    UserEntity deleteUser(Long id);
    UserEntity deleteUserByUsername(String username);
    UserEntity deleteUserByEmail(String email);
    List<UserEntity> getAllUsers();
}