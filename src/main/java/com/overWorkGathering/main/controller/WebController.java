package com.overWorkGathering.main.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {
	
	@RequestMapping(value="/calendar")
	public String calendar() {
		System.out.println("CalendarCalendarCalendarCalendarCalendar");
		
		return "Calendar";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "Login";
	}
	
	@RequestMapping(value="/SignUp")
	public String SignUp() {
		return "SignUp";
	}
	
	@RequestMapping(value="/FindPw")
	public String FindPw() {
		return "FindPw";
	}
	
	@RequestMapping(value="/CalendarPopup")
	public String CalendarPopup() {
		return "CalendarPopup";
	}
}
