package com.techlabs.oop;

import java.util.Scanner;

public class studenttest {

	public static void main(String[] args) {
		Student student1=new Student();
		
		
		student1.display();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Details of first student:");
		System.out.println("Enter Roll Number: ");
		int rollnumber=scanner.nextInt();
		System.out.println("Enter Name:");
		String name=scanner.next();
		System.out.println("Enter Age:");
		int age=scanner.nextInt();
		student1.intialize( rollnumber, name, age);
		
		student1.display();
		
		
		
		Student student2=new Student();
		
		
		System.out.println("Enter Details of first student:");
		System.out.println("Enter Roll Number: ");
	 rollnumber=scanner.nextInt();
		System.out.println("Enter Name:");
		name=scanner.next();
		System.out.println("Enter Age:");
		 age=scanner.nextInt();
		student2.intialize(rollnumber, name, age);
		student2.display();

	}

}
