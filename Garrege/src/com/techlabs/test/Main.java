package com.techlabs.test;
	import java.io.IOException;
	import java.util.Scanner;

import com.techlabs.model.Car;

import SerializationUtil.Serial;

	public class Main {
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter the number of cars: ");
	        int n = scanner.nextInt();
	        scanner.nextLine();  

	        Car[] cars = new Car[n];

	        for (int i = 0; i < n; i++) {
	            System.out.println("Enter details for car " + (i + 1));
	            System.out.print("Company Name: ");
	            String companyName = scanner.nextLine();
	            System.out.print("Mileage: ");
	            int mileage = scanner.nextInt();
	            System.out.print("Price: ");
	            double price = scanner.nextDouble();
	            scanner.nextLine();  

	            cars[i] = new Car(companyName, mileage, price);

	            
	            String fileName = "car" + (i + 1) + ".txt";
	            try {
	                Serial.serialize(cars[i], fileName);
	            } catch (IOException e) {
	                System.err.println("Error serializing car " + (i + 1) + ": " + e.getMessage());
	            }
	        }

	        
	        for (int i = 0; i < n; i++) {
	            String fileName = "car" + (i + 1) + ".txt";
	            try {
	                Car car = Serial.deserialize(fileName);
	                System.out.println("Deserialized Car " + (i + 1) + ": " + car);
	            } catch (IOException | ClassNotFoundException e) {
	                System.err.println("Error deserializing car " + (i + 1) + ": " + e.getMessage());
	            }
	        }

	        scanner.close();
	    }
	}

