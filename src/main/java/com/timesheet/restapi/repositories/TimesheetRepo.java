package com.timesheet.restapi.repositories;

import com.timesheet.restapi.model.Timesheet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface TimesheetRepo extends JpaRepository<Timesheet, Long> {

    List<Timesheet> findAllByTaskContainingIgnoreCase(String task);

}
