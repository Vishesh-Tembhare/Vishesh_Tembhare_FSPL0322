package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;

@Entity
@Data
@Table(name="DesgnationInfo")
public class designation {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long designationId;
    private String designationname;


    private boolean isActive;
    private String createdBy;
    private LocalDateTime createdDate;
    private String updatedBy;
    private LocalDateTime updatedDate;

}
