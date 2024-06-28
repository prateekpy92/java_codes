package com.techlabs.credentials.factory.model;

	public class CarFactory {
	    public static Car getCar(String carName) {
	        Car car = null;

	        if (carName.equalsIgnoreCase("Maruti")) {
	            car = new Maruti();
	        } else if (carName.equalsIgnoreCase("Tata")) {
	            car = new TATA();
	        } else if (carName.equalsIgnoreCase("Mahindra")) {
	            car = new Mahindra();
	        }

	        return car;
	    }
	}


