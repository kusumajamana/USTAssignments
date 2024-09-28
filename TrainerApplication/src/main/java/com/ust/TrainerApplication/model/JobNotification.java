package com.ust.TrainerApplication.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JobNotification {
    @Id
    private int jobId;
    private String jobTitle;
    private String description;
    private String location;
    private long salary;

}
