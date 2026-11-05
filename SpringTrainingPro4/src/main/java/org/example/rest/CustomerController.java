package org.example.rest;

import org.example.rest.service.CustomerService;
import org.example.rest.entity.Customer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class CustomerController {

    @Autowired
    private CustomerService customerService;


    @GetMapping("/api/customers")
    public List<Customer> getCustomers() {
    return customerService.getCustomersWithA();
    }
}
