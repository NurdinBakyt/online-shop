package org.nurdin.school.repository;

import org.nurdin.school.entity.RoleEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.NativeQuery;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<RoleEntity, Long> {
    @Query("SELECT r FROM RoleEntity r WHERE r.title = :title")
    Optional<RoleEntity> findByTitle(@Param("title") String title);
}