package com.techlabs.solution.model;


	// Concrete Hotel Class for Indian Hotel
	public class IndianHotel implements IHotel {
	    @Override
	    public IMenu getMenu() {
	        return new IndianMenu();
	    }
	}