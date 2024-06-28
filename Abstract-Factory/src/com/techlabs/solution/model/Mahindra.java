package com.techlabs.solution.model;

public class Mahindra implements ICars {
    @Override
    public void start() {
    	System.out.println("Mahindra started.");
    }
    @Override
    public void stop() {
    	System.out.println("Mahindra stopped.");
    }
}
