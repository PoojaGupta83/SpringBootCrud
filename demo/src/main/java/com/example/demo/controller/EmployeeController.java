package com.example.demo.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.Model.Employee;
import com.example.demo.Service.EmployeeService;

@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    // displaying list of all employees
    @GetMapping("/Employee")
    public List<Employee> getAllEmployee() {
        return employeeService.getAllEmployees();
    }


    // inserting employee
    @PostMapping("/Employee")
    public Employee addEmployees(@RequestBody Employee employee) {
        return employeeService.addEmployee(employee);
    }

    //updating employee by id
    @PutMapping("/Employee/{id}")
    public Employee updateEmployee(@RequestBody Employee e, @PathVariable Integer id) {
       return  employeeService.updateEmployee(e, id);

    }

    // deleting all employees
    @DeleteMapping("/Employee")
    public void deleteAllEmployees() {
        employeeService.deleteAllEmployees();
    }
}