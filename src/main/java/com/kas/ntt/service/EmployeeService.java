package com.kas.ntt.service;

import com.kas.ntt.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> findAll();
    Employee create(Employee employee);
    void delete(Long id);


}