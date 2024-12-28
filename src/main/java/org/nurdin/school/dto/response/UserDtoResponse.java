package org.nurdin.school.dto.response;

import java.util.List;

public record UserDtoResponse(
        Long id,
        String username,
        String email,
        int age,
        List<String> role,
        String phoneNumber
) {
}
