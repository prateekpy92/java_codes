package com.techlabs.composite.solution.test;

import java.util.Scanner;

import com.techlabs.composite.solution.model.Accountant;
import com.techlabs.composite.solution.model.BankManager;
import com.techlabs.composite.solution.model.Cashier;
import com.techlabs.composite.solution.model.Employee;

public class CompositePatternDemo {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        printWelcomeMessage();
        Employee manager = createManager();

        while (true) {
            Employee employee = createEmployee();
            if (employee == null) {
                break;
            }
            manager.add(employee);
        }

        printManagerAndEmployeeDetails(manager);
        scanner.close();
    }

    private static void printWelcomeMessage() {
        System.out.println("Welcome to Employee Management System!");
        System.out.println("Let's start by creating a manager.");
    }

    private static Employee createManager() {
        System.out.println("\nEnter details for Bank Manager:");
        System.out.print("ID: ");
        int managerId = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Name: ");
        String managerName = scanner.nextLine();
        System.out.print("Salary: ");
        double managerSalary = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character

        return new BankManager(managerId, managerName, managerSalary);
    }

    private static Employee createEmployee() {
        System.out.println("\nEnter details for Employee (Enter 'done' to finish):");
        System.out.print("Type (Cashier/Accountant): ");
        String type = scanner.nextLine();

        if (type.equalsIgnoreCase("done")) {
            return null;
        }

        System.out.print("ID: ");
        int empId = scanner.nextInt();
        scanner.nextLine(); // consume the newline character
        System.out.print("Name: ");
        String empName = scanner.nextLine();
        System.out.print("Salary: ");
        double empSalary = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character

        switch (type.toLowerCase()) {
            case "cashier":
                return new Cashier(empId, empName, empSalary);
            case "accountant":
                return new Accountant(empId, empName, empSalary);
            default:
                System.out.println("Invalid employee type. Skipping...");
                return null;
        }
    }

    private static void printManagerAndEmployeeDetails(Employee manager) {
        System.out.println("\nManager and Employee Details:");
        manager.print();
    }
}

  