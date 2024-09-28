package com.ust.TrainerApplication.service;

import com.ust.TrainerApplication.model.JobNotification;
import com.ust.TrainerApplication.repo.JobRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JobNotificationService {
    @Autowired
    private JobRepository repo;
    public JobNotification addjobnotification(JobNotification notification) {
        return repo.save(notification);
    }

    public List<JobNotification> getAllJobs() {
        return repo.findAll();
    }

    public JobNotification getjobbyid(int jobId) {
        return repo.findById(jobId).orElse(null);
    }
}
