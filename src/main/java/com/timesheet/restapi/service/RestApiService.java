package com.timesheet.restapi.service;

import com.timesheet.restapi.model.Timesheet;

import java.util.List;

public interface RestApiService {
	
	List<Timesheet> listAllTimesheet() throws Exception;

}
