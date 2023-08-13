package com.timesheet.restapi.service;

import java.util.List;
import java.util.Map;

import com.timesheet.restapi.model.Timesheet;

public interface RestApiService {
	
	public List<?> listAllTimesheet () throws Exception;
	
	public void addTimesheet (Timesheet timesheet) throws Exception;
	
	public void editTimesheet (Long timesheetId) throws Exception;
	
	public void deleteTimesheet (Long timesheetId) throws Exception;
	
	public Object getUser (Map<String, Object> filters) throws Exception;
	
	public Object getStatus (Map<String, Object> filters) throws Exception;

}
