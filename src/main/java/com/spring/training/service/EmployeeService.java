package com.spring.training.service;

import com.spring.training.dto.EmployeeDetailDto;
import com.spring.training.dto.EmployeeSummaryDto;
import com.spring.training.model.Employee;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

public interface EmployeeService {

    List<EmployeeSummaryDto> getEmployees();

    EmployeeDetailDto save(EmployeeDetailDto employee);

    Optional<EmployeeDetailDto> update(EmployeeDetailDto employee);

    Optional<EmployeeDetailDto> delete(Integer id);

    Optional<EmployeeDetailDto> findById(Integer id);
}
