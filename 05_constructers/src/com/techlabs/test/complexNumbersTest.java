package com.techlabs.test;

import com.techlabs.model.complexNumbers;

public class complexNumbersTest {

	 public static void main(String[] args) {
	        complexNumbers c1 = new complexNumbers(2.0, 3.0);
	        complexNumbers c2 = new complexNumbers(1.0, 4.0);

	        
	        c1.add(c2);
	        System.out.println("After adding c2 to c1: " + c1);

	 }


}
