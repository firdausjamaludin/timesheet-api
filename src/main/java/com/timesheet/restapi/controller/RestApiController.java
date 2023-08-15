package com.timesheet.restapi.controller;

import com.timesheet.restapi.model.Timesheet;
import com.timesheet.restapi.request.TaskRequestBean;
import com.timesheet.restapi.service.RestApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.crossstore.ChangeSetPersister;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/timesheet")
public class RestApiController {

    private final Logger logger = LoggerFactory.getLogger(RestApiController.class);

    private final RestApiService restApiService;

    @Autowired
    public RestApiController(RestApiService restApiService) {
        super();
        this.restApiService = restApiService;
    }

    @GetMapping(path = "/listTimesheet")
    public List<Timesheet> listTimesheet() throws Exception {
        return restApiService.listAllTimesheet();
    }

    @PostMapping(path = "/listTask")
    public List<Timesheet> listByTask(@RequestBody TaskRequestBean requestBean) throws Exception {
        String taskValue = requestBean.getTask();
        return restApiService.listByTask(taskValue);
    }

    @PostMapping("/createTimesheets")
    public ResponseEntity<Timesheet> createTimesheet(@RequestBody Timesheet newTimesheet) {
        try {
            Timesheet createdTimesheet = restApiService.createTimesheet(newTimesheet);
            return ResponseEntity.status(HttpStatus.CREATED).body(createdTimesheet);
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @CrossOrigin(origins = "http://localhost:4200")
    @PutMapping("/editTimesheets/{timesheetId}")
    public ResponseEntity<Timesheet> updateTimesheet(@PathVariable Long timesheetId, @RequestBody Timesheet updatedTimesheet) {
        try {
            Timesheet updatedTimesheetResult = restApiService.updateTimesheet(timesheetId, updatedTimesheet);
            return ResponseEntity.ok(updatedTimesheetResult);
        } catch (ChangeSetPersister.NotFoundException ex) {
            return ResponseEntity.notFound().build();
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }

    @DeleteMapping("/deleteTimesheets/{timesheetId}")
    public ResponseEntity<Void> deleteTimesheet(@PathVariable Long timesheetId) {
        try {
            restApiService.deleteTimesheet(timesheetId);
            return ResponseEntity.noContent().build(); // Successful deletion
        } catch (ChangeSetPersister.NotFoundException ex) {
            return ResponseEntity.notFound().build(); // Not found
        } catch (Exception ex) {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build(); // Internal server error
        }
    }

}
