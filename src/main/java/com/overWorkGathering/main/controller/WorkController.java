package com.overWorkGathering.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.overWorkGathering.main.DTO.WorkDTO;
import com.overWorkGathering.main.service.UserService;
import com.overWorkGathering.main.service.WorkService;

@RestController
@RequestMapping(path = "/work")
public class WorkController {

	@Autowired
	WorkService workService;	

	@RequestMapping(value="/retrievework", method = RequestMethod.GET)
	public List<WorkDTO> retrieveWork(String id) {
		return workService.retrieveWork(id);
	}
}
