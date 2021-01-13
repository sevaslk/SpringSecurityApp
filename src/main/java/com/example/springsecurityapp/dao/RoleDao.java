package com.example.springsecurityapp.dao;

import com.example.springsecurityapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleDao extends JpaRepository<Role, Long> {
}
