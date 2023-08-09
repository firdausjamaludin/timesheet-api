package com.example.timesheetapi.model;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class BaseModel {
	private Long id;
	private String desc;
	private String name;
	private LocalDate createdAt;
	private String createdBy;
	private LocalDate updatedAt;
	private String updatedBy;	

}
