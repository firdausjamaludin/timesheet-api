package com.example.timesheetapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.timesheetapi.model.Status;

@Repository
public interface StatusRepo extends JpaRepository<Status, Long> {

}
