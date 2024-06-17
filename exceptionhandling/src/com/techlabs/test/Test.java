package com.techlabs.test;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
        try {
            int number1 = Integer.parseInt(args[0]);
            int number2 = Integer.parseInt(args[1]);
            double division = calculateDivision(number1, number2);
            System.out.println(division);
        } catch (NumberFormatException e) {
            System.out.println("Invalid input: Please enter two integers.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Please provide two input numbers.");
        } finally {
            System.out.println("Inside finally");
        }

        System.out.println("Byeee");
    }

    private static double calculateDivision(int number1, int number2) {
        double division = 0;
        try {
            division = (double) number1 / number2;
        } catch (ArithmeticException e) {
            System.out.println("Division by zero is not allowed.");
        }
        return division;
    }
}