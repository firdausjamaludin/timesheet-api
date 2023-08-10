package com.example.timesheetapi.model;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(schema = "timesheetdb", name = "timesheet")
@NoArgsConstructor
@Getter @Setter
public class Timesheet extends BaseModel {
	
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "timesheet_id")
	private Long timesheetId;
	
	@Column(name = "user_id")
	private Long userId;
	
	@Column(name = "status_id")
	private Long statusId;
	
	@Column(name = "project")
	private String project;
	
	@Column(name = "task")
	private String task;
	
	@Column(name = "start_at")
	private LocalDate startedAt;
	
	@Column(name = "end_at")
	private LocalDate finishAt;
	
}
