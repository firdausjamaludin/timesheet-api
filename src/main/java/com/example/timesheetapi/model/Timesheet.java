package com.example.timesheetapi.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Timesheet extends BaseModel {
	
	private String project;
	private String task;
	private LocalDate startedAt;
	private LocalDate finishAt;
	
}
