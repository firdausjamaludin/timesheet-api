package com.example.timesheetapi.controller;

import java.util.HashMap;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.timesheetapi.service.TimesheetService;

@RestController
@RequestMapping(path = "api/v1/common")
public class TimesheetController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TimesheetController.class);
	
	private TimesheetService timesheetService;
	
	public TimesheetController(TimesheetService timesheetService) {
		super();
		this.timesheetService = timesheetService;
	}

	@GetMapping(path = "/getUser")
	public Object getUser() throws Exception {
		Map<String, Object> filters = new HashMap<>();		
				
		return timesheetService.getUser(filters);
	}

}
