package com.overWorkGathering.main.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.overWorkGathering.main.entity.WorkEntity;

public interface WorkRepository extends JpaRepository<WorkEntity, String> {

	List<WorkEntity> findAllByUserId(String id);

	WorkEntity findAllByUserIdAndWorkDt(String userId, String workDt);

	List<WorkEntity> findAllByUserIdAndWorkDtLike(String userId, String workDt);
	
}
