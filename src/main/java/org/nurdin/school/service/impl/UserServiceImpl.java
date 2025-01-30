package org.nurdin.school.service.impl;

import jakarta.persistence.EntityNotFoundException;
import org.nurdin.school.dto.UserDTO;
import org.nurdin.school.entity.RoleEntity;
import org.nurdin.school.entity.UserEntity;
import org.nurdin.school.repository.RoleRepository;
import org.nurdin.school.repository.UserRepository;
import org.nurdin.school.service.UserService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;
    private final RoleRepository roleRepository;

    public UserServiceImpl(UserRepository userRepository, RoleRepository roleRepository) {
        this.userRepository = userRepository;
        this.roleRepository = roleRepository;
    }
    @Override
    public UserEntity register(UserEntity user) {
        Set<RoleEntity> roles = user.getRoles()
                .stream()
                .map(x -> roleRepository.findByTitle(x.getTitle())
                        .orElseThrow(() -> new RuntimeException("Роль не найдена")))
                .collect(Collectors.toSet());

        user.setRoles(roles);

        return userRepository.save(user);
    }

    @Override
    public UserEntity findById(Long id) {
        return userRepository.findById(id).orElse(null);
    }

    @Override
    public UserEntity findByUsername(String name) {
        return userRepository.findByUsername(name);
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
    }

    @Override
    public UserEntity updateUserName(String username, String newUsername) {
        UserEntity user = userRepository.findByUsername(username);
        user.setUsername(newUsername);
        return userRepository.save(user);
    }


    @Override
    public UserEntity updateUserPassword(String email, String newPassword) {
        UserEntity user = userRepository.findByEmail(email);
        user.setPassword(newPassword);
        return userRepository.save(user);
    }

    @Override
    public UserEntity deleteUser(Long id) {
        UserEntity user = userRepository.findById(id).orElse(null);
        if(user != null) {
            userRepository.delete(user);
        }
        return user;
    }

    @Override
    public UserEntity deleteUserByName(String username) {
        UserEntity user = userRepository.findByUsername(username);
        if(user != null) {
            userRepository.delete(user);
        }
        return user;
    }

    @Override
    public UserEntity deleteUserByEmail(String email) {
        UserEntity user = userRepository.findByEmail(email);
        if(user != null) {
            userRepository.delete(user);
        }
        return user;
    }

    @Override
    public List<UserEntity> getAllUsers() {
        return userRepository.findAll();
    }
}