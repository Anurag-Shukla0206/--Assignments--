package com.anurag.EmployeeAddress.controller;


import com.anurag.EmployeeAddress.model.Employee;
import com.anurag.EmployeeAddress.service.EmployeeService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
    public class EmployeeController {
        @Autowired
        EmployeeService employeeService;

        @GetMapping("employee")
        public Iterable<Employee> getAllEmployees()
        {
            return employeeService.getAllEmployees();
        }

        @GetMapping("employeewithid")
        public Employee getEmployeebyid(@RequestParam("id") Long employeeId)
        {
            return employeeService.getEmployeebyid(employeeId);
        }

        @PostMapping("employee")
        public String addEmployee(@RequestBody @Valid Employee employee)
        {
            return employeeService.addEmployee(employee);
        }



        @PutMapping("employee")

        public String UpdateEmployeet (@RequestParam("id") Long employeeId, @RequestParam("contact") String contact)
        {
            return employeeService.UpdateEmployee (employeeId,contact);
        }
        @DeleteMapping("employee")

        public String DeleteEmployee(@RequestParam("id") Long employeeId)
        {
            return employeeService.DeleteEmployee(employeeId);
        }

    }
