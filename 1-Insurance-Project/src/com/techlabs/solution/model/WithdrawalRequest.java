package com.techlabs.solution.model;

public class WithdrawalRequest {
    private String requestId;
    private Customer customer;
    private double amount;
    
    // Constructor, getters, and setters
    public WithdrawalRequest(String requestId, Customer customer, double amount) {
        this.requestId = requestId;
        this.customer = customer;
        this.amount = amount;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
