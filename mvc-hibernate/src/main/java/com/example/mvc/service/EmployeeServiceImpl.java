package com.example.mvc.service;

import com.example.mvc.dto.EmployeeDto;
import com.example.mvc.dto.SaveEmployeeDto;
import com.example.mvc.model.Employee;
import com.example.mvc.repository.EmployeeRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EmployeeServiceImpl implements EmployeeService {
    private final EmployeeRepository employeeRepository;
    private final ModelMapper modelMapper;

    @Autowired
    public EmployeeServiceImpl(EmployeeRepository employeeRepository, ModelMapper modelMapper) {
        this.employeeRepository = employeeRepository;
        this.modelMapper = modelMapper;
    }

    @Override
    public List<EmployeeDto> finAll() {
        List<Employee> employees = employeeRepository.findAll();

        return employees.stream()
                .map(e -> modelMapper.map(e, EmployeeDto.class))
                .collect(Collectors.toList());
    }

    @Override
    public void save(SaveEmployeeDto saveEmployeeDto) {
        Employee employee = modelMapper.map(saveEmployeeDto, Employee.class);
        employeeRepository.save(employee);
    }
}
