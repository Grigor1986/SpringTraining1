package org.example.rest.service;

import lombok.RequiredArgsConstructor;
import org.example.rest.dao.CustomerRepository;
import org.example.rest.entity.Customer;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class CustomerServiceImpl implements CustomerService {

    private final CustomerRepository customerRepository;

    @Override
    @Transactional
    public List<Customer> getCustomersWithA() {
        List<Customer> customers = customerRepository.findAll();
        return customers.stream()
                .filter(c -> c.getFirstName().contains("a") || c.getFirstName().contains("A"))
                .collect(Collectors.toList());
    }
}
