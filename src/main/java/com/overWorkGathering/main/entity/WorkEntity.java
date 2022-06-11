package com.overWorkGathering.main.entity;

import javax.persistence.Column;
import javax.persistence.ColumnResult;
import javax.persistence.ConstructorResult;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.overWorkGathering.main.DTO.UserDTO;

import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Table(name = "WORK")
public class WorkEntity {
	
	@Id
	@Column(name = "USER_ID")
	private String userId;
	
	@Column(name = "WORK_DT")
	private String workDt;
	
	@Column(name = "START_TIME")
	private String startTime;
	
	@Column(name = "END_TIME")
	private String endTime;
	
	@Column(name = "IMG")
	private String img;
	
	@Column(name = "TAXI_PAY")
	private String taxiPay;
	
	@Column(name = "DINNER_YN")
	private String dinnerYn;
	
	@Column(name = "TAXI_YN")
	private String taxiYn;
	
}
