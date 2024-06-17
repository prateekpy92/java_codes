package com.techlabs.test;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.Iterator;


public class EmployeeTest {
    public EmployeeTest(int id, String name, double salary) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
        List<EmployeeTest> employees = new LinkedList<EmployeeTest>();

        Scanner scanner = new Scanner(System.in);

        System.out.println("How many employees?");
        int size = scanner.nextInt();

        for (int i = 0; i < size; i++) {
            System.out.println("Enter Employee ID:");
            int id = scanner.nextInt();
            System.out.println("Enter Employee Name:");
            String name = scanner.next();
            System.out.println("Enter Employee Salary:");
            double salary = scanner.nextDouble();

            employees.add(new EmployeeTest(id, name, salary));
        }

        System.out.println(employees);

        if (employees.size() > 2) {
            EmployeeTest employee = employees.get(2);
            System.out.println(employee);
        } else {
            System.out.println("Not enough employees to retrieve the third one.");
        }
    }
}