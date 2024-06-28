package com.techlabs.ocp.test;

import com.techlabs.ocp.model.Festival;
import com.techlabs.ocp.model.FixedDeposits;

public class FixedDepositTest {
	

	    public static void main(String[] args) {
	        FixedDeposits fd1 = new FixedDeposits(1, "Pranav", 10000, 5, Festival.DIWALI);
	        System.out.println("Simple Interest for Diwali > " + fd1.getName() + ": " + fd1.calculateSimpleInterest());

	        FixedDeposits fd2 = new FixedDeposits(1, "Pranav", 20000, 5, Festival.HOLI);
	        System.out.println("Simple Interest for " + fd1.getName() + ": " + fd2.calculateSimpleInterest());
	        
	        FixedDeposits fd3 = new FixedDeposits(1, "Pranav", 20000, 5, Festival.NEWYEAR);
	        System.out.println("Simple Interest for " + fd1.getName() + ": " + fd3.calculateSimpleInterest());
	    }
	}


