package com.techlabs.test;


import com.techlabs.model.Insurance;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class InsuranceManager {
    private static void sortByName(ArrayList<Insurance> policies) {
    	  Collections.sort(policies, Comparator.comparing(Insurance::getPolicyHolderName));
    }

    private static void sortByAmount(ArrayList<Insurance> policies) {
        Collections.sort(policies, Comparator.comparingDouble(Insurance::getPolicyAmount));
    }

    private static void sortByCreationDate(ArrayList<Insurance> policies) {
        Collections.sort(policies, Comparator.comparing(Insurance::getPolicyCreationDate));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Insurance> policies = new ArrayList<>();

        System.out.print("---> How many policies: ");
        int numberOfPolicies = scanner.nextInt();
        scanner.nextLine(); 

        for (int i = 0; i < numberOfPolicies; i++) {
            System.out.println("----> Enter details of policy " + (i + 1));

            System.out.print("Policy Number: ");
            int policyNumber = scanner.nextInt();
            scanner.nextLine(); 

            System.out.print("Policy Holder Name: ");
            String policyHolderName = scanner.nextLine();

            System.out.print("Policy Amount: ");
            double policyAmount = scanner.nextDouble();
            scanner.nextLine(); 

            System.out.print("Policy Creation Date (YYYY-MM-DD): ");
            String dateInput = scanner.nextLine();
            LocalDate policyCreationDate = LocalDate.parse(dateInput);

            policies.add(new Insurance(policyNumber, policyHolderName, policyAmount, policyCreationDate));
        }

        while (true) {
            System.out.println("\n1. Sort by Name");
            System.out.println("2. Sort by Amount");
            System.out.println("3. Sort by Creation Date");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume newline

            switch (choice) {
                case 1:
                    sortByName(policies);
                    break;
                case 2:
                    sortByAmount(policies);
                    break;
                case 3:
                    sortByCreationDate(policies);
                    break;
                case 4:
                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("\nSorted Policies:");
            for (Insurance policy : policies) {
                System.out.println(policy);
            }
        }
    }
}
