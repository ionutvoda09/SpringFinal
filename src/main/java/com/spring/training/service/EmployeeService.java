package com.spring.training.service;

import com.spring.training.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {
    List<Employee> getEmployees();
}
