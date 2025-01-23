package org.nurdin.school.service.impl;

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
        return null;
    }

    @Override
    public UserEntity findByUsername(String email) {
        return null;
    }

    @Override
    public UserEntity findByEmail(String email) {
        return userRepository.findByEmail(email);
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
        return userRepository.findAll();
    }
}