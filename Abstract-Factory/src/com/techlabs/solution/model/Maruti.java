package com.techlabs.solution.model;

public class Maruti implements ICars {
    @Override
    public void start() {
    	System.out.println("Maruti started."); 
    }
    @Override
    public void stop() {
    	System.out.println("Maruti stopped.");
    }
}
