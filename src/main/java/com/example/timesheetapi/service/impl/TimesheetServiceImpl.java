package com.example.timesheetapi.service.impl;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.example.timesheetapi.controller.TimesheetController;
import com.example.timesheetapi.model.Status;
import com.example.timesheetapi.service.TimesheetService;

import lombok.Getter;
import lombok.Setter;

@Service
@Getter @Setter
public class TimesheetServiceImpl implements TimesheetService {
	private static final Logger LOGGER = LoggerFactory.getLogger(TimesheetServiceImpl.class);

	
	
	public List<?> listAllTimesheet (Map<String, Object> filters) throws Exception {
		return null;		
	}
	
	public Object addTimesheet (Map<String, Object> filters) throws Exception {
		return null;		
	}
	
	public Object editTimesheet (Map<String, Object> filters) throws Exception {
		return null;		
	}
	
	public Object deleteTimesheet (Map<String, Object> filters) throws Exception {
		return null;		
	}
	
	public Object getUser (Map<String, Object> filters) throws Exception {
		Object result = null;
		
		Status status = new Status();
		
		status.setId(1L);
		status.setStatus("Open");
		
		LOGGER.debug("Check Status Value: {}",status);
		
		result = status;		
		
		return result;		
	}
	
	public Object getStatus (Map<String, Object> filters) throws Exception {
		return null;		
	}

}
