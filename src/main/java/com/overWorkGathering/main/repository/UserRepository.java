package com.overWorkGathering.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overWorkGathering.main.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	
}
