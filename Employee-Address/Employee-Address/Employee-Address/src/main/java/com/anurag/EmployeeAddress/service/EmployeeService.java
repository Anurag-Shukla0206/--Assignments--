package com.anurag.EmployeeAddress.service;

import com.anurag.EmployeeAddress.model.Employee;
import com.anurag.EmployeeAddress.repository.IEmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EmployeeService {
    @Autowired
    IEmployeeRepo employeeRepo;
    public Iterable<Employee> getAllEmployees() {
        return employeeRepo.findAll();
    }

    public Employee getEmployeebyid(Long employeeId) {
        Optional<Employee> optional= employeeRepo.findById(employeeId);
        if(optional.isPresent()){
            return optional.get();
        }
        return null;

    }

    public String addEmployee(Employee employee) {
        employeeRepo.save(employee);
        return "Employee  Added ";
    }

    public String UpdateEmployee(Long employeeId, String empContact) {

        if(employeeRepo.existsById(employeeId)){
            Employee employee = getEmployeebyid(employeeId);
            employee.setEmpContact(empContact);
            employeeRepo.save(employee);
            return "Employee Updated";
        }
        else{
            return "Employee  Id does not exist";
        }

    }

    public String DeleteEmployee(Long employeeId) {
        if(employeeRepo.existsById(employeeId)){
            employeeRepo.deleteById(employeeId);
            return "Employee Deleted";
        }
        else{
            return "Employee Id does not exist";
        }
    }
}