package com.anurag.UniversityEventManagement.service;

import com.anurag.UniversityEventManagement.model.Department;
import com.anurag.UniversityEventManagement.model.Student;
import com.anurag.UniversityEventManagement.repository.IStudentRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {

    @Autowired
    IStudentRepo studentRepo;

    public Iterable<Student> getAllStudents() {

        return studentRepo.findAll();
    }

    public Student getStudentbyid(Long studentId) {
        Optional<Student> optional= studentRepo.findById(studentId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;
    }


    public String addStudent(Student student) {
        studentRepo.save(student);
        return "Added";
    }



    public String UpdateStudentDepartment(Long studentId, Department department) {

        if(studentRepo.existsById(studentId)){
            Student student= getStudentbyid(studentId);
            student.setDepartment(department);
            studentRepo.save(student);
            return "Student Updated";
        }
        else{
            return "Student Id does not exist";
        }
    }

    public String DeleteStudent(Long studentId) {

        if(studentRepo.existsById(studentId)){
            studentRepo.deleteById(studentId);
            return "Student Deleted";
        }
        else{
            return "Student Id does not exist";
        }


    }
}