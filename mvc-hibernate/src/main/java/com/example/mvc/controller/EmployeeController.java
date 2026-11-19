package com.example.mvc.controller;

import com.example.mvc.model.Employee;
import com.example.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        List<Employee> employees = employeeService.finAll();
        model.addAttribute("employees", employees);
        return "main-page-employee";
    }
}
