package com.umeox.sc.user.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umeox.sc.user.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

	User findOneByUsername(String username);
}
