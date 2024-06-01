package com.teclabs.assi;
import java.util.Scanner; 
public class SecondLargestNumber {
        int n;

	        // Create an object of Scanner class.
	        Scanner sc = new Scanner(System.in);

	        // Enter the total number of elements.
  System.out.println("Enter total number of elements you want: ");
	        n = sc.nextInt();

	        // Check if the number of elements is less than 2
	        if (n < 2) {
	            System.out.println("Number of elements should be at least 2 to find the second largest element.");
	            return;
	        }

	        // Creating an array object.
	        int[] a = new int[n];

	       
	        System.out.println("Enter all the elements:");
	        for (int i = 0; i < n; i++) {
	            a[i] = sc.nextInt();
	        }

	        // Initialize max and secondMax
	        int max = Integer.MIN_VALUE;
	        int secondMax = Integer.MIN_VALUE;

	        // Find the largest and second largest elements
	        for (int i = 0; i < n; i++) {
	            if (a[i] > max) {
	                secondMax = max;
	                max = a[i];
	            } else if (a[i] > secondMax && a[i] != max) {
	                secondMax = a[i];
	            }
	        }

	        // Check if the second largest element exists
	        if (secondMax == Integer.MIN_VALUE) {
	            System.out.println("There is no second largest element in the array.");
	        } else {
	            System.out.println("The second largest element in the array is: " + secondMax);
	        }

	        // Close the scanner
	        sc.close();
	    }
	}
