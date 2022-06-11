package com.overWorkGathering.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.overWorkGathering.main.service.WorkService;

@Controller
public class WebController {
	
	@Autowired
	WorkService workService;
	
	@RequestMapping(value="/calendar")
	public String calendar() {
		
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
	public ModelAndView CalendarPopup(String userID, String workDt) {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("CalendarPopup");
		
		return mav;
	}
}
