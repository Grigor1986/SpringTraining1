package com.example.mvc.controller;

import com.example.mvc.dto.EmployeeDto;
import com.example.mvc.dto.SaveEmployeeDto;
import com.example.mvc.model.Employee;
import com.example.mvc.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping("/")
    public String getMainPage(Model model) {
        List<EmployeeDto> employees = employeeService.finAll();
        model.addAttribute("employees", employees);
        return "main-page-employee";
    }

    @GetMapping("/add")
    public String getAddPage(Model model) {
        model.addAttribute("saveEmployeeDto", new SaveEmployeeDto());
        return "add-employee";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute SaveEmployeeDto saveEmployeeDto) {
        employeeService.save(saveEmployeeDto);
        return "/redirect:";

    }
}
