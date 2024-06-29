package com.techlabs.solution.test;

import java.util.Scanner;

import com.techlabs.solution.model.HotelReception;

public class Client {
    public static void main(String[] args) {
        HotelReception reception = new HotelReception();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        while (!exit) {
            System.out.println("Welcome to the Hotel Menu System!");
            System.out.println("Please select an option:");
            System.out.println("1. Get Indian Menu");
            System.out.println("2. Get Italian Menu");
         
            System.out.println("3. Exit");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    reception.getIndianMenu();
                    break;
                case 2:
                    reception.getItalianMenu();
                    break;
            
                case 3:
                    exit = true;
                    break;
                default:
                    System.out.println("Invalid choice, please try again.");
            }

            System.out.println();
        }

        scanner.close();
        System.out.println("Thank you for using the Hotel Menu System!");
    }
}
