package com.overWorkGathering.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overWorkGathering.main.entity.UserEntity;
import com.overWorkGathering.main.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository testRepository;
	
	public void test() {
		List<UserEntity> testEntityList
			= testRepository.findAll();
		
		testEntityList.stream().forEach(
				testEntity -> System.out.println(testEntity));
	}
}
