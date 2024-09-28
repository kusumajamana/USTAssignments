package com.ust.TrainerApplication.controller;

import com.ust.TrainerApplication.model.JobNotification;
import com.ust.TrainerApplication.service.JobNotificationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/ust")
public class JobNotificationController {
    @Autowired
    private JobNotificationService service;

    @PostMapping("/addjobnotification")
    public JobNotification addjobnotification(@RequestBody JobNotification notification){
        return service.addjobnotification(notification);
    }
    @GetMapping("/jobs")
    public List<JobNotification> getAllJobs(){
        return service.getAllJobs();
    }

    @GetMapping("/jobs/{JobId}")
    public JobNotification getjobbyid(@PathVariable int JobId){
        return service.getjobbyid(JobId);
    }
}
