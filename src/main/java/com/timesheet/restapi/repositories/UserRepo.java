package com.timesheet.restapi.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.timesheet.restapi.model.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long> {

}
