package com.vitordev.hruser.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vitordev.hruser.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
	User findByEmail(String email);
}
