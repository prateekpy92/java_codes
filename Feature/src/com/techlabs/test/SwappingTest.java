package com.techlabs.test;

import java.util.function.BiConsumer;

import com.techlabs.model.Swapping;

public class SwappingTest implements Swapping {


	    public BiConsumer<Integer, Integer> getSwapper() {
	        return (a, b) -> {
	            int temp = a;
	            a = b;
	            b = temp;
	        };
	    }

	    public static void main(String[] args) {
	  
	        SwappingTest swapper = new SwappingTest();

	
	        int number1 = 5;
	        int number2 = 10;

	        BiConsumer<Integer, Integer> swapperFunction = swapper.getSwapper();

	        System.out.println("Before swapping: number1 = " + number1 + ", number2 = " + number2);

	  
	        swapperFunction.accept(number1, number2);

	      
	        System.out.println("After swapping: number1 = " + number1 + ", number2 = " + number2);
	    }
	}


