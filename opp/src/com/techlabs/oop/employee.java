package com.techlabs.oop;

public class employee {
	private int Empid;
	private String Empname;
	private int salary;
	
	public void intialize() {
		
		Empid=1000059;
		Empname="Prateek";
		salary=25000;
	}
		public void display() 
		{
			System.out.println("EmployeeId: "+Empid);
        	System.out.println("Employee Name: "+Empname);
			System.out.println("salary: "+salary);
		}
	}