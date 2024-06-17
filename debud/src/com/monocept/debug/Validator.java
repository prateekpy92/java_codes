package com.monocept.debug;

import java.util.Scanner;


public class Validator {
	 static Scanner scanner = new Scanner(System.in); 
	 public static boolean validateInput(String input, int minimum, int maximum) {
	    	
	 if (input == null || input==""|| input.length()<minimum)
	 return false ;
	return false;
	 }
	    public static boolean validateUsername(String username) {
	    
	    	
	        return validateInput(username,3,20);
	    }

	    public static boolean validatePassword(String password) {
	    	
	        return validateInput(password,8,30);
	    }

	    public static boolean validateEmail(String email) {
	    	if (!validateInput(email,5,50))

if (!email.contains("@")|| ! email.contains(null))
			return false;
			return false;
	    }

	    public static void main(String[] args) {
	        testValidateUsername();
	        testValidatePassword();
	        testValidateEmail();
	    }

	    public static void testValidateUsername() {
	        String[] usernames = { "validUser", null};
	        for (String username : usernames) {
	            System.out.println("Testing username: " + username);
	            boolean result = validateUsername(username);
	            System.out.println("Result: " + result + "\n");
	        }
	    }

	    public static void testValidatePassword() {
	        String[] passwords = {"validPassword123",null};
	        for (String password : passwords) {
	            System.out.println("Testing password: " + password);
	            boolean result = validatePassword(password);
	            System.out.println("Result: " + result + "\n");
	        }
	    }

	    public static void testValidateEmail() {
	        String[] emails = {"", null};
	        for (String email : emails) {
	            System.out.println("Testing email: " + email);
	            boolean result = validateEmail(email);
	            System.out.println("Result: " + result + "\n");
	        }
	    }
	}
