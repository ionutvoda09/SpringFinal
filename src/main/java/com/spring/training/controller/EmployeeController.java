package com.spring.training.controller;

import java.util.List;
import java.util.Optional;

import com.spring.training.dto.EmployeeDetailDto;
import com.spring.training.dto.EmployeeSummaryDto;
import com.spring.training.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

@RestController
@RequestMapping("/api/v1/employees")
public class EmployeeController {

    @Autowired
    EmployeeService service;

    @GetMapping("/showAll")
    public List<EmployeeSummaryDto> getEmployees() {
        List<EmployeeSummaryDto> employeesList = service.getEmployees();
        return employeesList;
    }

    @PostMapping("/save")
    public ResponseEntity create(@Valid @RequestBody EmployeeDetailDto employee) {
        return ResponseEntity.ok(service.save(employee));
    }

    @DeleteMapping("/delete/{id}")
    public ResponseEntity delete(@PathVariable @NotNull Integer id){
        if(service.delete(id) != null)
            return ResponseEntity.ok(service.delete(id));
        else
            return ResponseEntity.of(Optional.of(service.delete(id)));
    }

}
