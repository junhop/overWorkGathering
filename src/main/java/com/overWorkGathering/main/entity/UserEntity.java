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
	
}
