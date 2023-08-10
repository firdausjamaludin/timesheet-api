package com.example.timesheetapi.controller;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.timesheetapi.model.Timesheet;
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
	
	@GetMapping(path = "/listAllTimesheet")
	public List<Timesheet> listAllTimesheet() throws Exception {
		//Map<String, Object> filters = new HashMap<>();		
				
		return (List<Timesheet>) timesheetService.listAllTimesheet();
	}
	
	@PostMapping
	public void addTimesheet(@RequestBody Timesheet timesheet) throws Exception {
		//Map<String, Object> filters = new HashMap<>();		
				
		timesheetService.addTimesheet(timesheet);
	}
	
	@PutMapping(path = "{timesheetId}")
	public void editTimesheet(@PathVariable("timesheetId") Long timesheetId) throws Exception {
		//Map<String, Object> filters = new HashMap<>();		
				
		timesheetService.editTimesheet(timesheetId);
	}
	
	@DeleteMapping(path = "{timesheetId}")
	public void deleteTimesheet(@PathVariable("timesheetId") Long timesheetId) throws Exception {
		//Map<String, Object> filters = new HashMap<>();		
				
		timesheetService.deleteTimesheet(timesheetId);
	}

	@GetMapping(path = "/getUser")
	public Object getUser() throws Exception {
		Map<String, Object> filters = new HashMap<>();		
				
		return timesheetService.getUser(filters);
	}
	
	@GetMapping(path = "/getStatus")
	public Object getStatus() throws Exception {
		Map<String, Object> filters = new HashMap<>();		
				
		return timesheetService.getStatus(filters);
	}

}
