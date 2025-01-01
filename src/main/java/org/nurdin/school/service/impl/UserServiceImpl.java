package org.nurdin.school.service.impl;

import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class UserServiceImpl implements UserService {
    private List<UserEntity> users = new ArrayList<>();

    @Override
    public UserEntity save(UserEntity user) {
        long newId = users.isEmpty() ? 1 : users.get(users.size() - 1).getId() + 1;
        user.setId(newId);

        users.add(user);
        return user;
    }

    @Override
    public UserEntity findById(Long id) {
        return null;
    }

    @Override
    public Optional<UserEntity> findByUsername(String username) {
        return users.stream()
                .filter(u -> u.getUsername().equals(username))
                .findAny();
    }

    @Override
    public Optional<UserEntity> findByEmail(String email) {
        return Optional.empty();
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
