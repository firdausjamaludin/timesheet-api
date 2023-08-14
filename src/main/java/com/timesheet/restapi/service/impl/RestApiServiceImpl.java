package com.timesheet.restapi.service.impl;

import com.timesheet.restapi.model.Timesheet;
import com.timesheet.restapi.repositories.StatusRepo;
import com.timesheet.restapi.repositories.TimesheetRepo;
import com.timesheet.restapi.repositories.UserRepo;
import com.timesheet.restapi.service.RestApiService;
import lombok.Getter;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
@Getter
@Setter
public class RestApiServiceImpl implements RestApiService {

    private final Logger logger = LoggerFactory.getLogger(RestApiServiceImpl.class);


    private TimesheetRepo timesheetRepo;
    private UserRepo userRepo;
    private StatusRepo statusRepo;

    @Autowired
    public RestApiServiceImpl(TimesheetRepo timesheetRepo, UserRepo userRepo, StatusRepo statusRepo) {
        this.timesheetRepo = timesheetRepo;
        this.userRepo = userRepo;
        this.statusRepo = statusRepo;
    }

    @Override
    public List<Timesheet> listAllTimesheet() throws Exception {
        List<Timesheet> result = timesheetRepo.findAll();

        logger.debug("listAllTimesheet result: {}", result);

        if (result == null || result.isEmpty()) {
            throw new Exception("No result found");
        }
        return result;
    }

    @Override
    public List<Timesheet> listByTask(String task) throws Exception {
        List<Timesheet> result = timesheetRepo.findAllByTaskContainingIgnoreCase(task);
        return result != null && !result.isEmpty() ? result : Collections.emptyList();
    }
}
