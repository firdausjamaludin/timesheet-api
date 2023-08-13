package com.timesheet.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timesheet.restapi.model.Timesheet;

@Repository
public interface TimesheetRepo extends JpaRepository<Timesheet, Long> {

}
