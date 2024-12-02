package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name="DepartmentInfo")
public class departments {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long departmentId;
        private String departmentname;


        private boolean isActive;
        private String createdBy;
        private LocalDateTime createdDate;
        private String updatedBy;
        private LocalDateTime updatedDate;
}
