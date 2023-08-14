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
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.CrossOrigin;

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

    public Timesheet createTimesheet(Timesheet newTimesheet) throws Exception {
        return timesheetRepo.save(newTimesheet);
    }


    public Timesheet updateTimesheet(Long id, Timesheet updatedTimesheet) throws Exception{
        Timesheet existingTimesheet = timesheetRepo.findById(id)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        existingTimesheet.setProject(updatedTimesheet.getProject());
        existingTimesheet.setTask(updatedTimesheet.getTask());
        existingTimesheet.setStartDate(updatedTimesheet.getStartDate());
        existingTimesheet.setDueDate(updatedTimesheet.getDueDate());
        existingTimesheet.setUser(updatedTimesheet.getUser());
        existingTimesheet.setStatus(updatedTimesheet.getStatus());

        return timesheetRepo.save(existingTimesheet);
    }

    public void deleteTimesheet(Long timesheetId) throws Exception {
        Timesheet existingTimesheet = timesheetRepo.findById(timesheetId)
                .orElseThrow(ChangeSetPersister.NotFoundException::new);

        timesheetRepo.delete(existingTimesheet);
    }
}
