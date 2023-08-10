package com.example.timesheetapi.service;

import java.util.List;
import java.util.Map;

import com.example.timesheetapi.model.Timesheet;

public interface TimesheetService {
	
	public List<?> listAllTimesheet () throws Exception;
	
	public void addTimesheet (Timesheet timesheet) throws Exception;
	
	public void editTimesheet (Long timesheetId) throws Exception;
	
	public void deleteTimesheet (Long timesheetId) throws Exception;
	
	public Object getUser (Map<String, Object> filters) throws Exception;
	
	public Object getStatus (Map<String, Object> filters) throws Exception;

}
