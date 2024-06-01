package com.techlabs.whilel;

public class table {

	public static void main(String[] args) {
		int num = 5; 
        
		System.out.println("Multiplication table of " + num + ":");
        int i = 1;
        while (i <= 10) {
            System.out.println(num + " x " + i + " = " + (num * i));
            i++;
    }

	}
} 


