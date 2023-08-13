package com.timesheet.restapi.model;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;
import java.io.Serializable;
import java.time.LocalDate;

@MappedSuperclass
@NoArgsConstructor
@Getter
@Setter
public class BaseModel implements Serializable {

    @Serial
    private static final long serialVersionUID = 1L;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @Column(name = "updated_at")
    private LocalDate updatedAt;

    @Column(name = "is_deleted")
    private Boolean isDeleted;

}
