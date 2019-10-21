package com.codeclan.EmployeeTracker.controllers;

import com.codeclan.EmployeeTracker.models.Employee;
import com.codeclan.EmployeeTracker.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping(value="/employees")
public class EmployeeController {

    @Autowired
    EmployeeRepository employeeRepository;

    @GetMapping
    public List<Employee> getAllEmployees(){
        return employeeRepository.findAll();
    }

    @GetMapping(value = "/{id}")
    public Optional<Employee> getEmployeeById(@PathVariable Long id){
        return employeeRepository.findById(id);
    }

    @DeleteMapping(value = "/delete/{id}")
    public void deleteEmployeeById(@PathVariable Long id){
        employeeRepository.deleteById(id);
    }
}
