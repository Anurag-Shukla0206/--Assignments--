package com.anurag.JobSearchPortal.controller;

import com.anurag.JobSearchPortal.model.Job;
import com.anurag.JobSearchPortal.service.JobService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class JobController {
    @Autowired
    JobService jobService;

    @GetMapping("jobs")
    public Iterable<Job> getAllJobs (){
        return jobService.getAllJobs();
    }


    @PostMapping("jobs")
    public String addJobs(@RequestBody Job job){
        return jobService.addJobs(job);

    }

    @GetMapping("jobs/search/by")

    public Iterable<Job>  getJobsByTitle (@RequestParam("title") String title){
        return jobService.getJobsByTitle(title);
    }




    @PutMapping("job/update/of")
    public String updateJob ( @RequestParam("id") Long jobId ,@RequestParam("salary") Double salary){
        return jobService.updateJob(jobId,salary);
    }

    @DeleteMapping ("job/delete/of")
    public String deleteJob (@RequestParam("id") Long jobId ){
        return jobService.deleteJob(jobId);
    }



}
