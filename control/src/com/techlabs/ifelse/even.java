package com.techlabs.ifelse;

import java.util.Scanner;

public class even {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the number 1");
		int number1= scanner.nextInt();
		
		if (number1 % 2 == 0) {
		    System.out.println(number1 + " is even.");
		} else {
		    System.out.println(number1 + " is odd.");
		}
}
}		

	


