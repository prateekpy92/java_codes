package com.techlabs.oop;

public class Student {

	private int rollnumber;
	private String name;
	private int age;
	void intialize(int rollnumber1,String name1, int age1 ) {
		
		rollnumber=rollnumber1;
		name=name1;
		age=age1;
	}
	
	void display() 
	{
		System.out.println("rollnumber"+rollnumber);
	
		System.out.println("name"+name);
		System.out.println("age"+age);
	}
}
