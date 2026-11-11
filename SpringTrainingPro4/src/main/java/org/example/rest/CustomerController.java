package org.example.rest;

import org.example.rest.service.CustomerService;
import org.example.rest.entity.Customer;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customers/")
public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("")
    public List<Customer> getCustomers() {
        return customerService.getCustomers();
    }

    @GetMapping("/{id}")
    public Customer getCustomer(@PathVariable Integer id) {
        return customerService.getCustomersById(id);
    }

    @PostMapping("")
    public Customer createCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @PutMapping("")
    public Customer updateCustomer(@RequestBody Customer customer) {
        return customerService.save(customer);
    }

    @DeleteMapping("/{id}")
    public void deleteCustomers(@PathVariable Integer id) {
        customerService.delete(id);
    }
}

