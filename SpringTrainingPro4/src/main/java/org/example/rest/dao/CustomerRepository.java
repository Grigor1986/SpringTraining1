package org.example.rest.dao;

import org.example.rest.entity.Customer;

import java.util.List;

public interface CustomerRepository {
    List<Customer> findAll();
}
