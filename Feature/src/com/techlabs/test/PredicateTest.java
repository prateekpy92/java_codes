package com.techlabs.test;
import java.util.function.Predicate;
public class PredicateTest {
	


	    public static void main(String[] args) {
	    
	        Predicate<Integer> evenPredicate = (number) -> {
	           
	            return number % 2 == 0;
	        };

	       
	        if (evenPredicate.test(5)) {
	            System.out.println("Number is even");
	        } else {
	            System.out.println("Number is odd");
	        }
	    }
	}



