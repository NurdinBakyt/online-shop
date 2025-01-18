package org.nurdin.school.util;

import org.nurdin.school.dto.response.RoleResponseDto;
import org.nurdin.school.entity.RoleEntity;

import java.util.List;

public class RolesMapper {
    public static RoleResponseDto toRoleResponseDto(RoleEntity role) {
        RoleResponseDto roleResponseDto = new RoleResponseDto();
        roleResponseDto.setRole(role.getRoleTitle());
        return roleResponseDto;
    }
    public static List<RoleResponseDto> toRoleResponseDtoList(List<RoleEntity> roleResponseDto) {
        return roleResponseDto.stream()
                .map(RolesMapper::toRoleResponseDto)
                .toList();
    }
}
