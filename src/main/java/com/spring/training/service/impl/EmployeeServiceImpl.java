package com.spring.training.service.impl;

import com.spring.training.dto.EmployeeDetailDto;
import com.spring.training.dto.EmployeeSummaryDto;
import com.spring.training.model.Employee;
import com.spring.training.repository.EmployeeRepository;
import com.spring.training.service.EmployeeService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Autowired
    private ModelMapper modelMapper;

    @Override
    public List<EmployeeSummaryDto> getEmployees() {
        return entitiesToDtos(repository.findAll());
    }

    @Override
    public EmployeeDetailDto save(EmployeeDetailDto employee) {
        //Much beautiful way:
        //return modelMapper.map(repository.save(modelMapper.map(employee, Employee.class)), EmployeeDetailDto.class);

        //convert given DTO to Entity
        Employee toSave = modelMapper.map(employee, Employee.class);

        //After save, the EmployeeRepository gives us the saved entity and we need to convert back to DTO
        EmployeeDetailDto response = modelMapper.map(repository.save(toSave), EmployeeDetailDto.class);

        return response;
    }

    @Override
    public EmployeeDetailDto delete(Integer id) {
        Optional<Employee> employeeToDelete = repository.findById(id);
        if (employeeToDelete.isPresent()) {
            repository.delete(employeeToDelete.get());
            return modelMapper.map(employeeToDelete.get(), EmployeeDetailDto.class);
        } else return null;
    }

    //This method convert a list of Employee Entity to a list of EmployeeSummary
    private List<EmployeeSummaryDto> entitiesToDtos(List<Employee> input) {
        List<EmployeeSummaryDto> output = new ArrayList<>();
        input.forEach(employee -> {
            output.add(modelMapper.map(employee, EmployeeSummaryDto.class));
        });
        return output;
    }
}
