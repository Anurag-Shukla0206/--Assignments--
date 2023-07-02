package com.anurag.JobSearchPortal.repository;

import com.anurag.JobSearchPortal.model.Job;
import jakarta.transaction.Transactional;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IJobRepo extends CrudRepository<Job,Long> {


    Iterable<Job> getJobsByTitle(String title);





    @Transactional
    @Modifying
    @Query("delete from Job where jobId=:jobId")
    public void deleteJob(@Param("jobId") Long jobId);

    @Transactional
    @Modifying
    @Query("update Job set salary = :salary where jobId = :jobId")
    public void updateJobSalary( @Param("salary") Double salary,@Param("jobId") Long jobId);



}
