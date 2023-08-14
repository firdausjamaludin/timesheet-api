package com.timesheet.restapi.service;

import com.timesheet.restapi.model.Timesheet;

import java.util.List;

public interface RestApiService {
	
	List<Timesheet> listAllTimesheet() throws Exception;

	List<Timesheet> listByTask(String task) throws Exception;

	Timesheet createTimesheet(Timesheet newTimesheet) throws Exception;

	Timesheet updateTimesheet(Long id, Timesheet updatedTimesheet) throws Exception;

	void deleteTimesheet(Long timesheetId) throws Exception;

}
