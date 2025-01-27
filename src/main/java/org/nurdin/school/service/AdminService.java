package org.nurdin.school.service;

import org.nurdin.school.dto.UserDTO;
import org.springframework.boot.autoconfigure.security.SecurityProperties;

public interface AdminService {

    UserDTO addUser(SecurityProperties.User user);
    void updateUser(UserDTO user);
    void deleteUser(UserDTO user);
}
