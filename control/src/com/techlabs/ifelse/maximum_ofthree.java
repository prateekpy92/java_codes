package com.techlabs.ifelse;

import java.util.Scanner;

public class maximum_ofthree {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the number 1");
		int num1= scanner.nextInt();
		

		System.out.println("enter the number 2");
		int num2= scanner.nextInt();
		

		System.out.println("enter the number 3");
		int num3= scanner.nextInt();
		int max = num1; 

		if (num2 > max) {
		    max = num2; 
		}

		if (num3 > max) {
		    max = num3; 
		}

		System.out.println("The maximum of the three numbers is: " + max);
	}

}
