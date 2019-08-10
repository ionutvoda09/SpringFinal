package com.spring.training.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.spring.training.model.Employee;

@RestController
public class EmployeeController {

	@RequestMapping("/")
    public List<Employee> getEmployees()
    {
		List<Employee> employeesList = new ArrayList<Employee>();
		employeesList.add(new Employee(1,"java","iasi","iasi4@gmail.com"));
		return employeesList;
    }

}
