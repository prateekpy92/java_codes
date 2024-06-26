package com.techlabs.input;

import java.util.Scanner;

import com.techlabs.first.Student1;

public class Student {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        Student1[] student = new Student1[n];

        for (int i = 0; i < n; i++) {
            System.out.println("Enter details for student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Age: ");
            int age = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Email ID: ");
            String emailId = scanner.nextLine();
            
            System.out.print("Status (ENROLLED, GRADUATED): ");
            String status = scanner.nextLine();
            
            
        }

     
        System.out.println("List of students:");
        for (Student1 student1 : student) {
            System.out.println(student1);
        }

        scanner.close();
    }


	}


