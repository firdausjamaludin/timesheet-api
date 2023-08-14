package com.timesheet.restapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@Entity
@Table(schema = "timesheetdb", name = "timesheet")
@NoArgsConstructor
@Getter
@Setter
public class Timesheet extends BaseModel {

    @Serial
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "timesheet_id")
    private Long timesheetId;

    @Column(name = "project")
    private String project;

    @Column(name = "task")
    private String task;

    @Column(name = "start_date")
    private String startDate;

    @Column(name = "due_date")
    private String dueDate;

    @ManyToOne
    @JoinColumn(name = "user_id", referencedColumnName = "user_id")
    private User user;

    @ManyToOne
    @JoinColumn(name = "status_id", referencedColumnName = "status_id")
    private Status status;

}
