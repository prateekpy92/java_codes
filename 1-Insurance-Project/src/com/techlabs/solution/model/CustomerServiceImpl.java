package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class CustomerServiceImpl implements CustomerService {
    private List<Customer> customers = new ArrayList<>();

    @Override
    public void registerCustomer(Customer customer) {
        customers.add(customer);
    }

    @Override
    public void updateCustomerProfile(Customer customer) {
        // Business logic to update customer profile
    }

    @Override
    public List<InsurancePlan> getCustomerPolicies(Customer customer) {
        return customer.getPolicies();
    }

    @Override
    public void withdrawPolicy(Customer customer, InsurancePlan policy) {
        // Business logic to withdraw policy
    }
}
