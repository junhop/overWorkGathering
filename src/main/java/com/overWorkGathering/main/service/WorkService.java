package com.overWorkGathering.main.service;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.overWorkGathering.main.DTO.WorkDTO;
import com.overWorkGathering.main.entity.WorkEntity;
import com.overWorkGathering.main.repository.WorkRepository;

@Service
public class WorkService {
	
	@Autowired
	WorkRepository workRepository;
	
	ModelMapper modelMapper = new ModelMapper();
	
	public List<WorkDTO> retrieveWork(String userId) {
		
		List<WorkEntity> WorkEntityList = workRepository.findAllByUserId(userId);
		
		return null;
	}
	
	public WorkDTO retrieveWorkOne(String userId, String workDt) {
		WorkEntity workEntity = workRepository.findAllByUserIdAndWorkDt("jhyuk97", workDt);
		if(workEntity != null) {
			return modelMapper.map(workEntity, WorkDTO.class);
		}
		return null;
	}

}
