package com.example.springbootthymeleafcruddatabaserealtime.service;

import com.example.springbootthymeleafcruddatabaserealtime.model.Employee;

import java.util.List;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    void saveEmployee(Employee employee);

    Employee getEmployeeById(Long id);
}
