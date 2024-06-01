package com.techlabs.inputs;

import java.util.Scanner;

public class inputs {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("enter the number 1");
		int number1= scanner.nextInt();
		System.out.println("enter the number 2");
		int number2= scanner.nextInt();
		System.out.println("Swpping number is");
		number1=number2+number1;
		number2=number1-number2;
		number1=number1-number2;
		System.out.println(number1+" "+number2);
		
	}

}
