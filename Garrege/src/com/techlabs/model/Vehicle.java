package com.techlabs.model;
	import java.io.Serializable;

	public class Vehicle implements Serializable {
	    private String CarcompanyName;

	    public Vehicle(String companyName) {
	        this.CarcompanyName = companyName;
	    }

	    public String getCompanyName() {
	        return CarcompanyName;
	    }

	    public void setCompanyName(String companyName) {
	        this.CarcompanyName = companyName;
	    }
	}


