package com.techlabs.ocp.model;

public class FixedDeposits {

	    private int accountNumber;
	    private String name;
	    private double principal;
	    private int duration;
	    private Festival festival;

	    public FixedDeposits(int accountNumber, String name, double principal, int duration, Festival festival) {
	        this.accountNumber = accountNumber;
	        this.name = name;
	        this.principal = principal;
	        this.duration = duration;
	        this.festival = festival;
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

	    public Festival getFestival() {
	        return festival;
	    }

	    public void setFestival(Festival festival) {
	        this.festival = festival;
	    }

	    public double getInterestRates() {
	        switch (festival) {
	            case NEWYEAR:
	                return 8.0;
	            case DIWALI:
	                return 8.5;
	            case HOLI:
	                return 7.5;
	            default:
	                return 6.5;
	        }
	    }

	    public double calculateSimpleInterest() {
	        return (principal * duration * getInterestRates()) / 100;
	    }
	}


