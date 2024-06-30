package com.techlabs.solution.model;
import java.util.List;

public interface CustomerService {
    void registerCustomer(Customer customer);
    void updateCustomerProfile(Customer customer);
    List<InsurancePlan> getCustomerPolicies(Customer customer);
    void withdrawPolicy(Customer customer, InsurancePlan policy);
}


