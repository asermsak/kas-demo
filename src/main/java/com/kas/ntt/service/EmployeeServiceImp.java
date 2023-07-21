package com.kas.ntt.service;

import com.kas.ntt.model.Employee;
import com.kas.ntt.repo.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImp implements EmployeeService {

    @Autowired
    private EmployeeRepository repository;

    @Override
    public List<Employee> findAll() {

        return repository.findAll();
    }

    @Override
    public Employee create(Employee employee) {

        return repository.save(employee);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

}