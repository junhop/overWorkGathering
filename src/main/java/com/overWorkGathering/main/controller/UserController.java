package com.overWorkGathering.main.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.overWorkGathering.main.service.UserService;

@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService userService;
	
	@RequestMapping(value="/calendar", method = RequestMethod.GET)
	public String calendar() {
		System.out.println("CalendarCalendarCalendarCalendarCalendar");
		
		return "Calendar";
	}		
}
