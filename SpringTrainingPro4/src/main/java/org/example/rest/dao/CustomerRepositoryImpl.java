package org.example.rest.dao;

import lombok.RequiredArgsConstructor;
import org.example.rest.entity.Customer;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import java.util.List;

@RequiredArgsConstructor
@Repository
public class CustomerRepositoryImpl implements CustomerRepository {
    private final SessionFactory sessionFactory;

    @Override
    public List<Customer> findAll() {
        Session session = sessionFactory.getCurrentSession();
        List<Customer> customers = session.createQuery("FROM Customer", Customer.class)
                .getResultList();
        return customers;
    }
}
