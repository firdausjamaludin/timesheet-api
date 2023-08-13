package com.timesheet.restapi.request;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@JsonIgnoreProperties(ignoreUnknown = true)
@RequiredArgsConstructor
@Getter
@Setter
public class TaskRequestBean {
    private String task;
}
