package com.techlabs.test;
import java.util.function.BiPredicate;
public class Bipredicate {
	


	    public static void main(String[] args) {
	        BiPredicate<Integer, Integer> sumIsEvenPredicate = (num1, num2) -> {
	            return (num1 + num2) % 2 == 0;
	        };

	        int number1 = 5;
	        int number2 = 3;

	        if (sumIsEvenPredicate.test(number1, number2)) {
	            System.out.println("The sum of " + number1 + " and " + number2 + " is even");
	        } else {
	            System.out.println("The sum of " + number1 + " and " + number2 + " is odd");
	        }
	    }
	}


