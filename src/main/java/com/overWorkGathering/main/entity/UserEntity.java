package com.overWorkGathering.main.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "user")
public class UserEntity {
	
	@Id
	@Column(name = "ID")
	private String id;
	
	@Column(name = "PW")
	private String pw;
	
	@Column(name = "NAME")
	private String name;
	
	@Column(name = "EMAIL")
	private String email;
	
	@Column(name = "PART")
	private String part;
	
	@Column(name = "PARTLEADER")
	private String partleader;
	
	@Column(name = "AUTH")
	private String auth;
	
	@Column(name = "PHONE")
	private String phone;
	
	@Builder
	public UserEntity(
			String id, 
			String pw, 
			String name, 
			String email,
			String part,
			String partleader,
			String auth,
			String phone) {
		super();
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
