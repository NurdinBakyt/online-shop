package org.nurdin.school.util;

import org.nurdin.school.dto.RoleDTO;
import org.nurdin.school.entity.RoleEntity;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Component
public class RolesMapper {
    public static RoleDTO roleDTOtoEntity(RoleEntity role) {
        RoleDTO roleDTO = new RoleDTO();
        roleDTO.setId(role.getId());
        roleDTO.setTitle(role.getTitle());
        return roleDTO;
    }
    public static RoleEntity roleEntityToDTO(RoleDTO roleDTO) {
        RoleEntity roleEntity = new RoleEntity();
        roleEntity.setId(roleDTO.getId());
        roleEntity.setTitle(roleDTO.getTitle());
        return roleEntity;
    }
    public static List<RoleDTO> roleEntitySetToDTOSet(List<RoleEntity> roleEntitySet) {
        List<RoleDTO> roleDTOSet = new ArrayList<>();
        for (RoleEntity roleEntity : roleEntitySet) {
            roleDTOSet.add(roleDTOtoEntity(roleEntity));
        }
        return roleDTOSet;
    }
}
