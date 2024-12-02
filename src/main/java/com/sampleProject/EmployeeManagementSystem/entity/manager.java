package com.sampleProject.EmployeeManagementSystem.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name="ManagerInfo")
public class manager {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private long managerId;
        private String managerName;


        private boolean isActive;
        private String createdBy;
        private LocalDateTime createdDate;
        private String updatedBy;
        private LocalDateTime updatedDate;
}
