package com.example.timesheetapi.service;

import java.util.List;
import java.util.Map;

public interface TimesheetService {
	
	public List<?> listAllTimesheet (Map<String, Object> filters) throws Exception;
	
	public Object addTimesheet (Map<String, Object> filters) throws Exception;
	
	public Object editTimesheet (Map<String, Object> filters) throws Exception;
	
	public Object deleteTimesheet (Map<String, Object> filters) throws Exception;
	
	public Object getUser (Map<String, Object> filters) throws Exception;
	
	public Object getStatus (Map<String, Object> filters) throws Exception;

}
