package com.techlabs.solution.model;

public class Commission {
    private Agent agent;
    private double amount;
    
    // Constructor, getters, and setters
    public Commission(Agent agent, double amount) {
        this.agent = agent;
        this.amount = amount;
    }

    public Agent getAgent() {
        return agent;
    }

    public void setAgent(Agent agent) {
        this.agent = agent;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
