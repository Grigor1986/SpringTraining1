package com.example.mvc.service;

import com.example.mvc.dto.EmployeeDto;
import com.example.mvc.dto.SaveEmployeeDto;

import java.util.List;

public interface EmployeeService {
    List<EmployeeDto> finAll();

    void save(SaveEmployeeDto saveEmployeeDto);
}
