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
@Table(name = "user")
public class WorkEntity {
	
	@Id
	@Column(name = "ID")
	private String userId;
	
	@Column(name = "야근일")
	private String workDt;
	
	@Column(name = "근무시작시간")
	private String startTime;
	
	@Column(name = "근무종료시간")
	private String endTime;
	
	@Column(name = "택시비 영수증 이미지 파일 경로")
	private String img;
	
	@Column(name = "택시비")
	private String taxiPay;
	
	@Column(name = "저녁식대 청구 여부")
	private String dinnerYn;
	
	@Column(name = "택시비 청구 여부")
	private String taxiYn;
	
}
