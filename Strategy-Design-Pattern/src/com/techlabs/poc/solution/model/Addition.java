package com.techlabs.poc.solution.model;

public class Addition implements Strategy{  
	  
    @Override  
    public float calculation(float a, float b) {  
        return a+b;  
    }  
  
}
