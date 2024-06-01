package com.monocept.typecasting;

public class ImplicitExplit {

	public static void main(String[] args) {
		 int number1 = 10;
	        float number2 = 15.5f;

	        double sumImplicit = number1 + number2;

	        System.out.println("Sum (implicit conversion): " + sumImplicit);

	        
	        int sumExplicit = (int) (number1 + number2);

	        System.out.println("Sum (explicit conversion): " + sumExplicit);
	}
	}


