package com.ust.TrainerApplication.repo;

import com.ust.TrainerApplication.model.JobNotification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JobRepository extends JpaRepository<JobNotification,Integer> {
}
