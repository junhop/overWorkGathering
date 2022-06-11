package com.overWorkGathering.main.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class WorkDTO {
	private String userId;
	private String workDt;
	private String startTime;
	private String endTime;
	private String img;
	private String taxiPay;
	private String dinnerYn;
	private String taxiYn;
	
	@Builder
	public WorkDTO(
			String userId, 
			String workDt, 
			String startTime, 
			String endTime,
			String img,
			String taxiPay,
			String dinnerYn,
			String taxiYn) {
		this.userId = userId;
		this.workDt = workDt;
		this.startTime = startTime;
		this.endTime = endTime;
		this.img = img;
		this.taxiPay = taxiPay;
		this.dinnerYn = dinnerYn;
		this.taxiYn = taxiYn;
	}
}
