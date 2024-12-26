package org.nurdin.school.service.user;

import org.nurdin.school.dao.UserDao;
import org.nurdin.school.dto.UserDto;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;


@Service
public class UserService implements UserDao {

    @Override
    public Optional<UserDto> getUser(Long id) {
        return Optional.empty();
    }

    @Override
    public List<UserDto> getAllUsers() {
        return List.of();
    }

    @Override
    public void saveUser(UserDto user) {

    }

    @Override
    public void deleteUser(Long id) {

    }
}