package org.nurdin.school.service.impl;

import org.nurdin.school.entity.user.UserEntity;
import org.nurdin.school.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Override
    public UserEntity save(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }

    @Override
    public UserEntity findByUsername(String username) {
        return null;
    }

    @Override
    public UserEntity findByEmail(String email) {
        return null;
    }

    @Override
    public UserEntity updateUser(UserEntity user) {
        return null;
    }

    @Override
    public UserEntity updatePassword(UserEntity user, String newPassword) {
        return null;
    }

    @Override
    public UserEntity deleteUser(Long id) {
        return null;
    }

    @Override
    public UserEntity deleteUserByUsername(String username) {
        return null;
    }

    @Override
    public UserEntity deleteUserByEmail(String email) {
        return null;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return List.of();
    }
}
