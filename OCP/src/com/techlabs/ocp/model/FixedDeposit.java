package com.techlabs.ocp.model;

import com.techlabs.ocp.model.FestivalInterest;
public class FixedDeposit {
    private int accountNumber;
    private String name;
    private double principal;
    private int duration;
    private FestivalInterest festivalInterest;

    // Constructor
    public FixedDeposit(int accountNumber, String name, double principal, int duration, FestivalInterest festivalInterest) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.principal = principal;
        this.duration = duration;
        this.festivalInterest = festivalInterest;
    }

    // Getters and Setters
    public int getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(int accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrincipal() {
        return principal;
    }

    public void setPrincipal(double principal) {
        this.principal = principal;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public FestivalInterest getFestivalInterest() {
        return festivalInterest;
    }

    public void setFestivalInterest(FestivalInterest festivalInterest) {
        this.festivalInterest = festivalInterest;
    }

    // Method to calculate simple interest
    public double calculateInterest() {
        double rate = festivalInterest.getInterestRate();
        return (principal * duration * rate) / 100;
    }
}