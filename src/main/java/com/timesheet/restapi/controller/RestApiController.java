package com.timesheet.restapi.controller;

import com.timesheet.restapi.model.Timesheet;
import com.timesheet.restapi.service.RestApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(path = "api/timesheet")
public class RestApiController {

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
}
