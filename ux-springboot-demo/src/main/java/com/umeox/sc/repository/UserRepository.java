package com.umeox.sc.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.umeox.sc.domain.User;

public interface UserRepository extends JpaRepository<User, Long>{

}
