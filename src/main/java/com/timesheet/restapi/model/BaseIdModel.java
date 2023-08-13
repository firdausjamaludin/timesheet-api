package com.timesheet.restapi.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serial;

@MappedSuperclass
@NoArgsConstructor
@Getter @Setter
public class BaseIdModel extends BaseModel{
	
	@Serial
	private static final long serialVersionUID = 1L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
}
