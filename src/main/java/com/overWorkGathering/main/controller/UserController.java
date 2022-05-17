package com.overWorkGathering.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.overWorkGathering.main.service.UserService;

@RestController
@RequestMapping(path = "/test")
public class UserController {
	
	@Autowired
	UserService testService;
	
	@GetMapping(value = "/test")
	public void TEST(){
		testService.test();
	}
}
