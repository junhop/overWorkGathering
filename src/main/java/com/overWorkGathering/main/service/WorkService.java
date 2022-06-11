package com.overWorkGathering.main.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.stream.Collectors;

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

		LocalDate localDate = LocalDate.now();
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
		String nowDt = localDate.format(formatter);
		
		String yyyyMM = nowDt.substring(0, 7);
		
		//현재 달
		String workDt = "%" + yyyyMM + "%";
		
		List<WorkEntity> workEntityList =
		workRepository.findAllByUserIdAndWorkDtLike(userId, workDt);
		  
		return workEntityList
				.stream() 
				.map(workEntity -> modelMapper.map(workEntity,
						WorkDTO.class)) 
				.collect(Collectors.toList());
	}
	
	public WorkDTO retrieveWorkOne(String userId, String workDt) {
		WorkEntity workEntity = workRepository.findAllByUserIdAndWorkDt("jhyuk97", workDt);
		if(workEntity != null) {
			return modelMapper.map(workEntity, WorkDTO.class);
		}
		return null;
	}

}
