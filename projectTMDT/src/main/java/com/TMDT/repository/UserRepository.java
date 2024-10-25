package com.TMDT.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.TMDT.models.User;

public interface UserRepository extends JpaRepository<User, Long>{
	User findByUserName(String userName);
}
