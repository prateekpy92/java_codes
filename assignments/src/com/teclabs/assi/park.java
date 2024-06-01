package com.teclabs.assi;

import java.util.Scanner;

public class park {

	public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);

	        System.out.print("enter height (cm): ");
	        int height = scanner.nextInt();

	        System.out.print("enter age: ");
	        int age = scanner.nextInt();

	        System.out.print("do you want photos (yes/no)? ");
	        String wantphotosinput = scanner.next();
	        boolean wantphotos = wantphotosinput.equalsIgnoreCase("yes");

	        int cost = calculatecost(height, age, wantphotos);
	        System.out.println("The total bill is $" + cost);
	    }

	    public static int calculatecost(int height, int age, boolean wantphotos) {
	        int cost = 0;

	        if (height <= 120) {
	            System.out.println("can't ride");
	            return cost;
	        }
	        if (age >= 45) {
	        	
	        	return cost;
	        }

	        if (height > 120) {
	            System.out.println("can ride");
	            cost += 55;
	        }
	        if (age < 12 || (age > 18 && age < 44) ) {
	            System.out.println("start");
	            System.out.println("no");
	        }
	       
	       

	        if (age >= 12 && age <= 18) {
	            cost += 7;
	        }

	        if (wantphotos) {
	            System.out.println("yes");
	            cost += 12;
	        } else {
	            System.out.println("no");
	        }

	        cost += 3; 

	        return cost;
	    }
	}

