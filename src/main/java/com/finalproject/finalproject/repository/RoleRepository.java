package com.finalproject.finalproject.repository;

import java.util.Optional;

import com.finalproject.finalproject.models.ERole;
import com.finalproject.finalproject.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
