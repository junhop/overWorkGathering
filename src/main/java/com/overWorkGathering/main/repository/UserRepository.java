package com.overWorkGathering.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overWorkGathering.main.entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String> {
	UserEntity findByUserIdAndPw(String userId, String pw);

	List<UserEntity> findAllByPart(String part); 
}
