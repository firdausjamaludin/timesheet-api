package com.example.timesheetapi.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.timesheetapi.model.Status;
import com.example.timesheetapi.model.Timesheet;
import com.example.timesheetapi.model.User;
import com.example.timesheetapi.repositories.StatusRepo;
import com.example.timesheetapi.repositories.TimesheetRepo;
import com.example.timesheetapi.repositories.UserRepo;
import com.example.timesheetapi.service.TimesheetService;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class TimesheetServiceImpl implements TimesheetService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TimesheetServiceImpl.class);
	
	private TimesheetRepo timesheetRepo;
	
	private UserRepo userRepo;
	
	private StatusRepo statusRepo;
	
	
	
	public TimesheetServiceImpl(StatusRepo statusRepo) {
		super();
		this.statusRepo = statusRepo;
	}

	public List<?> listAllTimesheet () throws Exception {
		return timesheetRepo.findAll();		
	}
	
	public void addTimesheet (Timesheet timesheet) throws Exception {
		timesheetRepo.save(timesheet);		
	}
	
	public void editTimesheet (Long timesheetId) throws Exception {
		timesheetRepo.save(null);		
	}
	
	public void deleteTimesheet (Long timesheetId) throws Exception {
		timesheetRepo.deleteById(timesheetId);
	}
	
	public Object getUser (Map<String, Object> filters) throws Exception {
		Object result = null;
		
		User user = new User();
		
		result = userRepo.findAll();	
		
		return result;		
	}
	
	public Object getStatus (Map<String, Object> filters) throws Exception {
		Object result = null;
		
		Status status = new Status();
		
		result = statusRepo.findAll();	
		
		return result;		
	}

}
