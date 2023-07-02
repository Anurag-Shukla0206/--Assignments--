package com.anurag.JobSearchPortal.service;

import com.anurag.JobSearchPortal.model.Job;
import com.anurag.JobSearchPortal.repository.IJobRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class JobService {
    @Autowired
    IJobRepo jobRepo;



    public Iterable<Job> getAllJobs() {
        return jobRepo.findAll();
    }






    public Iterable<Job>  getJobsByTitle(String title) {
        return jobRepo.getJobsByTitle(title);
    }



    public String updateJob(Long jobId, Double salary) {

        if(jobRepo.existsById(jobId)){
            jobRepo.updateJobSalary(salary,jobId);
            return "Job Salary is Updated";
        }
        else{
            return "Job Id does not exist";
        }
    }

    public String deleteJob(Long jobId) {
        if(jobRepo.existsById(jobId)){
            jobRepo.deleteJob(jobId);
            return "Job id deleted";
        }
        else{
            return "Job Id does not exist";
        }
    }


    public String addJobs(Job job) {
        jobRepo.save(job);
        return "Added";
    }
}
