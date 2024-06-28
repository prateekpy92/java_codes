package com.techlabs.test;

public class StaticMethod {
	
	    public static void execute(StringConsumer consumer, String message) {
	        consumer.accept(message);
	    }

	    public static void main(String[] args) {
	   
	        execute(message -> Utility.staticMethod(message), "Hello, World!");
	      
	    }
	  
	}

