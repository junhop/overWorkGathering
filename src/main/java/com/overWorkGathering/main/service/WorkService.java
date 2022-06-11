package com.overWorkGathering.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overWorkGathering.main.DTO.WorkDTO;
import com.overWorkGathering.main.entity.WorkEntity;
import com.overWorkGathering.main.repository.WorkRepository;

@Service
public class WorkService {
	
	@Autowired
	WorkRepository workRepository;
	
	public List<WorkDTO> retrieveWork(String userId) {
		
		List<WorkEntity> WorkEntityList = workRepository.findAllByUserId(userId);
		
		return null;
	}

}
