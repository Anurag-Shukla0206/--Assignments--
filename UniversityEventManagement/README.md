# University Event Management

## Language and Framwork 

```bash
 Java , SpringBoot , JPA , H2 database
```

## Data Flow

 1. Controller (UniversityController.java)

```bash

  getAllStudents()
  getStudentByUserid
  addStudentr()
  DeleteStudentById()
  UpdateStudentDepartment()
  addEvent()
  updateEvent()
  deleteEvent()
  getEventByDate()
  getAllEvents()
```
2. Service (StudentSerice.java , EventService.java )

```bash
  getAllStudents()
  getStudentByUserid
  addStudentr()
  DeleteStudentById()
  UpdateStudentDepartment()
  addEvent()
  updateEvent()
  deleteEvent()
  getEventByDate()
  getAllEvents()
```

3. Model(Student.java , Department.java , Event.java )

```bash
 Students()
 Department()
 Event()
```
4. Repository

```bash
 IStudentRepo()
 IEventRepo()
```

## Data Structure Used

```bash
 H2 as database
```

## Project Summary

University Event Management is a system to maintain activities of students and event management.
 
  #### Features for Students

- you can Add/Create Student.
- you can Get all Student details.
- you can Get specific Student details by Student id.
- you can Update specific Student details/Contact by Student id.
- you can Delete/Remove specific Student details/Contact by Student id.

 #### Features for Events

- you can Add/Create Event.
- you can Get all Event details.
- you can Get specific Event details by Event id.
- you can Update specific Event details/Contact by Event id.
- you can Delete/Remove specific Event details/Contact by Event id.
