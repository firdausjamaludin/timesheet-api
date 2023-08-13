package com.timesheet.restapi.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.timesheet.restapi.model.Status;
import com.timesheet.restapi.model.Timesheet;
import com.timesheet.restapi.model.User;
import com.timesheet.restapi.repositories.StatusRepo;
import com.timesheet.restapi.repositories.TimesheetRepo;
import com.timesheet.restapi.repositories.UserRepo;
import com.timesheet.restapi.service.RestApiService;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class RestApiServiceImpl implements RestApiService {
	private static final Logger LOGGER = LoggerFactory.getLogger(RestApiServiceImpl.class);
	
	private TimesheetRepo timesheetRepo;
	
	private UserRepo userRepo;
	
	private StatusRepo statusRepo;
	
	
	
	public RestApiServiceImpl(StatusRepo statusRepo) {
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
