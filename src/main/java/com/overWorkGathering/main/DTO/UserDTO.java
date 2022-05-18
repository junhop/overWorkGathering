package com.overWorkGathering.main.DTO;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class UserDTO {
	
	private String id;
	private String pw;
	private String name;
	private String email;
	private String part;
	private String partleader;
	private String auth;
	private String phone;
	
	@Builder
	public UserDTO(
			String id, 
			String pw, 
			String name, 
			String email,
			String part,
			String partleader,
			String auth,
			String phone) {
		this.id = id;
		this.pw = pw;
		this.name = name;
		this.email = email;
		this.part = part;
		this.partleader = partleader;
		this.auth = auth;
		this.phone = phone;
	}
}
