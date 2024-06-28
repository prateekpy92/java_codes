package com.techlabs.test;
	import java.util.function.Predicate;
	import java.util.regex.Pattern;
	import java.util.Scanner;

	public class EmailValidate{
		public static void main(String[] args) {
	      
			
			        // Define a more comprehensive regex pattern for a valid email address
			        String emailRegex = "^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,6}$";
			        Pattern pattern = Pattern.compile(emailRegex);

			        // Define a Predicate to validate email addresses
			        Predicate<String> emailValidator = email -> pattern.matcher(email).matches();

			        // Create a Scanner object to read input from the console
			        Scanner scanner = new Scanner(System.in);

			        // Prompt the user to enter an email address
			        System.out.print("Enter an email address to validate: ");
			        String email = scanner.nextLine();

			        // Validate the email address using the Predicate
			        if (emailValidator.test(email)) {
			            System.out.println(email + " is a valid email.");
			        } else {
			            System.out.println(email + " is an invalid email.");
			        }

			        // Close the scanner
			        scanner.close();
			    }
			}