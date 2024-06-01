package com.monocept.typecasting;

import java.util.Scanner;

public class Array {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Enter the number of elements: ");
	int n = scanner.nextInt();
	int arr[] = new int[n]; 
	System.out.println("Enter the elements of the array:");
	    for (int i = 0; i < n; i++) {
	      arr[i] = scanner.nextInt();
	    }
	    int sum = 0;
	    for (int i = 0; i < n; i++) {
	     sum += arr[i];
	    }
	    
	    System.out.println("The sum of all elements is: " + sum);
	    
int max = arr[0];
for (int i = 1; i < n; i++) {
	      
	      if (arr[i] > max) {
	        max = arr[i];
	        System.out.println("The maximum element in the array is: " + max);
	      }
	    scanner.close();

	}
	}
}
