package com.timesheet.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timesheet.restapi.model.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

}
