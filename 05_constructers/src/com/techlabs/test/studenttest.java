package com.techlabs.test;

import java.util.Scanner;


import com.techlabs.model.student;
public class studenttest{
public static void main(String[] args) {
		student student1=new student(0, null, 0);
		
		
		
		System.out.println("rollnumber:");
		//System.out.println("("+student1.getX()+", "+student1.getY()+")");
		student1.setX(123);
		
		
		System.out.println("("+student1.getX()+")");
		
		student student2=new student(student1);
		
		
		
		System.out.println("name:" );
		System.out.println("("+student1.getX()+", "+student1.getY()+")");
		student1.setY("prateek");
		student student3=new student(20,"prateek",25);
		System.out.println("age:");
		student1.setz(23);
		
		
		



	}

}
