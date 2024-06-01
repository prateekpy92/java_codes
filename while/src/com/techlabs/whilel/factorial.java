package com.techlabs.whilel;

public class factorial {

	public static void main(String[] args) {
		int num = 5; 
        
        int factorial = 1;
        int i = 1;
        
        while (i <= num) {
            factorial *= i;
            i++;
        }
        
        System.out.println("Factorial of " + num + " is: " + factorial);
    }

	}


