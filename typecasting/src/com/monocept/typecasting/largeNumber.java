package com.monocept.typecasting;

import java.util.Scanner;

public class largeNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	int n = scanner.nextInt();
	int arr[] = new int[n]; 
	System.out.println("Enter the elements of the array:");
	    for (int i = 0; i < n; i++) {
	      arr[i] = scanner.nextInt();
	    }

	}

}
