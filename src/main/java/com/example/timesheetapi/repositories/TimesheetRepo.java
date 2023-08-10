package com.example.timesheetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.timesheetapi.model.Timesheet;

@Repository
public interface TimesheetRepo extends JpaRepository<Timesheet, Long> {

}
