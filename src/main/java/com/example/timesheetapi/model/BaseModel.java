package com.example.timesheetapi.model;

import java.io.Serializable;
import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@MappedSuperclass
@NoArgsConstructor
@Getter @Setter
public class BaseModel implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Column(name = "`value`")
    private String value;
	
	@Column(name = "`desc`")
    private String desc;
	
    @Column(name = "name")
    private String name;
    
    @Column(name = "created_at")
	private LocalDate createdAt;
    
    @Column(name = "created_by")
	private Long createdBy;
	
    @Column(name = "updated_at")
	private LocalDate updatedAt;
	
    @Column(name = "updated_by")
	private Long updatedBy;
    
    @Column(name = "is_deleted")
	private Boolean isDeleted;

}
