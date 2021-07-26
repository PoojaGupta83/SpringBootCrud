package com.example.demo.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.demo.Model.Employee;
import com.example.demo.Repository.EmployeeRepository;

// employee service class
@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    // inserting employee
    public Employee addEmployee(Employee e) {
        employeeRepository.save(e);
        return e;
    }

    //fetch all employees
    public List<Employee> getAllEmployees() {
        List<Employee> emps = (List<Employee>) employeeRepository.findAll();
        return emps;
    }

    // updating employee by id
    public Employee updateEmployee(Employee emp, Integer id) {
        {
            employeeRepository.save(emp);
        }
        return emp;
    }

    // deleting all employees
    public void deleteAllEmployees() {
        employeeRepository.deleteAll();
    }

}
