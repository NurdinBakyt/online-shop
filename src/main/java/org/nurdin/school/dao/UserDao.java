package org.nurdin.school.dao;

import org.nurdin.school.dto.UserDto;

import java.util.List;
import java.util.Optional;

public interface UserDao {
    Optional<UserDto> getUser(Long id);
    List<UserDto> getAllUsers();
    void saveUser(UserDto user);
    void deleteUser(Long id);
}