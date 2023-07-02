# Job Search Portal

## Language and Framwork 

```bash
 Java , SpringBoot , JPA , H2 database
```

## Data Flow

 1. Controller (JobController.java)

```bash

  getAllJobs()
  addJob()
  getJobsByTitle()
  DeleteJobs()
  UpdateJob()

```
2. Service (JobSerice.java)

```bash
  getAllJobs()
  addJob()
  
  getJobsByTitle()
  
  DeleteJobs()
  UpdateJob()
```

3. Model ( job.java , JobType.java )

```bash
  Job
  JobType
```
4. Repository ( IJobRepo.java)

```bash
  IJobRepo()
  getJobsByTitle()
  deleteJob()
  updateJobSalary()
```

## Data Structure Used

```bash
  H2 as database
```

## Project Summary

Job Search Portalis a system to handle activities related to Jobs details and services here u can add,get,update or delete a job also we used H2 as our Database
 
  #### Features for Job Search Portal

- you can Add/Create Jobs.
- you can Get all jobs details.
- you can Get all Job details by Job id.
- you can Get all Job details by Title
- you can Update specific Job details/Salary by using Job id.
- you can Delete/Remove a Job details by Job id.
