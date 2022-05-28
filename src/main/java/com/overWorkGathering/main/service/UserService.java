package com.overWorkGathering.main.service;

import java.util.List;
import java.util.stream.Collectors;


import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overWorkGathering.main.DTO.UserDTO;
import com.overWorkGathering.main.entity.UserEntity;
import com.overWorkGathering.main.repository.UserRepository;

@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	public void test() {
		List<UserEntity> userEntityList = userRepository.findAll();
		List<UserDTO> userDTOList = userEntityList.stream()
				.map(UserEntity -> modelMapper.map(UserEntity, UserDTO.class))
				.collect(Collectors.toList());		
		
		
	}
}
