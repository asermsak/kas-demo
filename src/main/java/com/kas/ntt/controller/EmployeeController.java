package com.kas.ntt.controller;

import com.kas.ntt.model.Employee;
import com.kas.ntt.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(value = "/find-all")
    public ResponseEntity<List<Employee>> findAll() {
        List<Employee> list = employeeService.findAll();
//        System.out.print(list);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @RequestMapping("/create")
    public Employee create(@RequestBody Employee employee) {
        return employeeService.create(employee);
    }

    @RequestMapping("/update/{id}")
    public Employee update(@PathVariable("id") Long id, @RequestBody Employee employee) {
        employee.setId(id);
        return employeeService.create(employee);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable("id") Long id) {
        employeeService.delete(id);
    }

}