package com.techlabs.model;
	public class Car extends FourWheeler {
	    private double price;

	    public Car(String carcompanyName, double mileage, double price) {
	        super(carcompanyName, mileage);
	        this.price = price;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        this.price = price;
	    }

	    @Override
	    public String toString() {
	        return "Car{" +
	                "companyName='" + getCompanyName() + '\'' +
	                ", mileage=" + getMileage() +
	                ", price=" + price +
	                '}';
	    }
	}

