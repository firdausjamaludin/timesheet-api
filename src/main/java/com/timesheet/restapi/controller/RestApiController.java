package com.timesheet.restapi.controller;

import com.timesheet.restapi.model.Timesheet;
import com.timesheet.restapi.request.TaskRequestBean;
import com.timesheet.restapi.service.RestApiService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin
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
}
