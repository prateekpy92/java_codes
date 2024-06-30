package com.techlabs.solution.model;

public class InsurancePlan {
    private String planId;
    private String planName;
    private double premiumAmount;
    
    // Constructor, getters, and setters
    public InsurancePlan(String planId, String planName, double premiumAmount) {
        this.planId = planId;
        this.planName = planName;
        this.premiumAmount = premiumAmount;
    }

    public String getPlanId() {
        return planId;
    }

    public void setPlanId(String planId) {
        this.planId = planId;
    }

    public String getPlanName() {
        return planName;
    }

    public void setPlanName(String planName) {
        this.planName = planName;
    }

    public double getPremiumAmount() {
        return premiumAmount;
    }

    public void setPremiumAmount(double premiumAmount) {
        this.premiumAmount = premiumAmount;
    }
}
