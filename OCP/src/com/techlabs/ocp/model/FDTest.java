package com.techlabs.ocp.model;


import java.util.Scanner;

import com.techlabs.ocp.model.FestivalInterest;
import com.techlabs.ocp.model.DiwaliInterst;
import com.techlabs.ocp.model.FixedDeposit;
import com.techlabs.ocp.model.HoliInterest;
import com.techlabs.ocp.model.NewYearInterest;
import com.techlabs.ocp.model.OtherInterest;




public class FDTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number of Fixed Deposits:");
        int numFDs = scanner.nextInt();
        scanner.nextLine(); 

        FixedDeposit[] deposit = new FixedDeposit[numFDs];

        
		for (int i = 0; i < numFDs; i++) {
            System.out.println("Enter details for Fixed Deposit " + (i + 1) + ":");

            System.out.print("Account Number: ");
            int accountNumber = scanner.nextInt();
            scanner.nextLine();

            System.out.print("Name: ");
            String name = scanner.nextLine();

            System.out.print("Principal Amount: ");


            System.out.print("Duration (in years): ");
            int duration = scanner.nextInt();
            scanner.nextLine(); 

            System.out.println("Select Festival Type:");
            System.out.println("1. NEWYEAR");
            System.out.println("2. DIWALI");
            System.out.println("3. HOLI");
            System.out.println("4. OTHERS");
            System.out.print("Enter choice (1-4): ");
            int festivalChoice = scanner.nextInt();
            scanner.nextLine(); // consume newline character

            FestivalInterest festivalInterest = null;
            switch (festivalChoice) {
                case 1:
                    festivalInterest = new NewYearInterest();
                    break;
                case 2:
                    festivalInterest = new DiwaliInterst();
                    break;
                case 3:
                    festivalInterest = new HoliInterest();
                    break;
                case 4:
                    festivalInterest = new OtherInterest();
                    break;
                default:
                    System.out.println("Invalid choice, defaulting to OTHERS");
                    festivalInterest = new OtherInterest();
                    break;
            }

			deposit[i] = new FixedDeposit(accountNumber, name, principal , duration, festivalInterest);
        }

        System.out.println("\nCalculating Simple Interest for each Fixed Deposit:");
        for (int i = 0; i < numFDs; i++) {
            FixedDeposit fd = deposit[i];
            double simpleInterest = fd.calculateInterest();
            System.out.println("\nFixed Deposit " + (i + 1) + " Details:");
            System.out.println("Account Number: " + fd.getAccountNumber());
            System.out.println("Name: " + fd.getName());
            System.out.println("Principal Amount: " + fd.getPrincipal());
            System.out.println("Duration: " + fd.getDuration() + " years");
            System.out.println("Festival Type: " + fd.getFestivalInterest().getClass());
            System.out.println("Simple Interest: " + simpleInterest);
        }

        
        
    }
}