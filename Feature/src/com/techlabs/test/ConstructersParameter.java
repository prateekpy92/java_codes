package com.techlabs.test;



import com.techlabs.model.Person;

public class ConstructersParameter {
	
	    public static void execute(PersonFactory factory, String name) {
	        Person person = factory.create(name);
	        System.out.println(person);
	    }

	    public static void main(String[] args) {
	        // Using lambda expression to pass the constructor
	        execute(name -> new Person(), "Bob");
	    }
	}
	 

