package com.spring.training.service;

import com.spring.training.dto.EmployeeDetailDto;
import com.spring.training.dto.EmployeeSummaryDto;
import com.spring.training.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

public interface EmployeeService {

    List<EmployeeSummaryDto> getEmployees();

    EmployeeDetailDto save(EmployeeDetailDto employee);

    EmployeeDetailDto delete(Integer id);
}
