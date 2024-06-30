package com.techlabs.solution.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private String customerId;
    private String name;
    private List<InsurancePlan> policies = new ArrayList<>();
    
    // Constructor, getters, and setters
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<InsurancePlan> getPolicies() {
        return policies;
    }

    public void addPolicy(InsurancePlan plan) {
        this.policies.add(plan);
    }
}
