package com.techlabs.model;
	public class FourWheeler extends Vehicle {
	    private double mileage;

	    public FourWheeler(String companyName, double mileage) {
	        super(companyName);
	        this.mileage = mileage;
	    }

	    public double getMileage() {
	        return mileage;
	    }

	    public void setMileage(int mileage) {
	        this.mileage = mileage;
	    }
	}



