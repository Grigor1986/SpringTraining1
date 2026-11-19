package com.example.mvc.repository;

import com.example.mvc.model.Employee;

import java.util.List;

public interface EmployeeRepository {
    List<Employee> findAll();
}
