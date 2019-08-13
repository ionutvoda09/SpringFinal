package com.spring.training.controller;

import java.util.ArrayList;
import java.util.List;

import com.spring.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.training.model.Employee;

@RestController
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/")
    public List<Employee> getEmployees() {
        List<Employee> employeesList = service.getEmployees();
        return employeesList;
    }



}
