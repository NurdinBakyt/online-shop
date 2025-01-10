package org.nurdin.school.service.impl;

import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    private List<UserEntity> users = new ArrayList<>();

    @Override
    public UserEntity register(UserEntity user) {
        users.add(user);
        for (UserEntity userEntity : users) {
            if (userEntity != null) {
                System.out.println(userEntity);
            } else {
                System.out.println("ошибка еблан");
            }
        }
        return user;
    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }

    @Override
    public UserEntity findByUsername(String email) {
        return null;
    }

    @Override
    public UserEntity findByEmail(String email) {
        for (UserEntity user : users) {
            if (user.getEmail().equals(email)) {
                return user;
            }
        }
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
        return new ArrayList<>(users);
    }
}