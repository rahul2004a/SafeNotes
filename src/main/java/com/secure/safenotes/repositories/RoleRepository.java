package com.secure.safenotes.repositories;

import com.secure.safenotes.models.AppRole;
import com.secure.safenotes.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(AppRole appRole);

}
