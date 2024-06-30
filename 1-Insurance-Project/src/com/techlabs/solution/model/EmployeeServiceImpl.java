package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class EmployeeServiceImpl implements EmployeeService {
    private List<Employee> employees = new ArrayList<>();

    @Override
    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void verifyCustomerDocuments(Customer customer) {
        // Business logic to verify customer documents
    }
}

