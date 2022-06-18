package com.overWorkGathering.main.controller;


import com.overWorkGathering.main.DTO.UserDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.overWorkGathering.main.service.UserService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@ResponseBody
@RestController
@RequestMapping(path = "/user")
public class UserController {
	
	@Autowired
	UserService userService;

	@Autowired
	WebController webController;
	
	@RequestMapping(value="/calendar", method = RequestMethod.GET)
	public String calendar() {
		System.out.println("CalendarCalendarCalendarCalendarCalendar");
		
		return "Calendar";
	}

	@PostMapping(value = "/auth")
	public UserDTO auth(HttpServletRequest request, HttpServletResponse response, UserDTO userInfo){
		System.out.println("화면에서 넘어 온 값" + userInfo.toString());

		HttpSession session = request.getSession();

		return userService.auth(session, userInfo);
	}
}
