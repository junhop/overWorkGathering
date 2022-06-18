package com.overWorkGathering.main.service;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Map;
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
	
	/*
	 * 해당날짜 식대신청여부확인을 위한 조회
	 */
	public WorkDTO retrieveWorkOne(String userId, String workDt) {
		WorkEntity workEntity = workRepository.findAllByUserIdAndWorkDt("jhyuk97", workDt);
		if(workEntity != null) {
			return modelMapper.map(workEntity, WorkDTO.class);
		}
		return null;
	}
	
	/*
	 * 야근식대 저장 및 업데이트
	 */
	public void saveWork(Map<String, Object> param) {
		String startTime = "09:00";
		String endTime = "";
		if("true".equals(param.get("dinnerYn").toString())) {
			param.replace("dinnerYn", "Y");
			endTime = "21:00";
		}else {
			param.replace("dinnerYn", "N");
		}
		
		if("true".equals(param.get("taxiYn").toString())) {
			param.replace("taxiYn", "Y");
			endTime = "23:00";
		}else {
			param.replace("taxiYn", "N");
		}
		
		WorkDTO workDTO = WorkDTO.builder().userId(param.get("userID").toString())
						 .workDt(param.get("workDt").toString())
						 .startTime(startTime)
						 .endTime(endTime)
						 .img(param.get("Img").toString())
						 .taxiPay(param.get("taxiPay").toString())
						 .dinnerYn(param.get("dinnerYn").toString())
						 .taxiYn(param.get("taxiYn").toString()).build();
		
		WorkEntity workEntity = modelMapper.map(workDTO, WorkEntity.class);
		
		workRepository.save(workEntity);
	}
	
	/*
	 * 야근식대 삭제
	 */
	public void deleteWork(Map<String, Object> param) {
		workRepository.deleteByUserIdAndWorkDt(param.get("userID").toString(), param.get("workDt").toString());
	}

}
