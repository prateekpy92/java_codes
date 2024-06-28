package com.techlabs.solution.model;

public class Tata implements ICars {
    @Override
    public void start() {
    	System.out.println("Tata started.");
    }
    @Override
    public void stop() {
    	 System.out.println("Tata stopped."); 
    }
}
