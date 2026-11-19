package com.example.mvc.repository;

import com.example.mvc.model.Employee;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository{

    private final SessionFactory sessionFactory;

    @Autowired
    public EmployeeRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    @Transactional
    public List<Employee> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("from Employee ", Employee.class).getResultList();
    }
}
