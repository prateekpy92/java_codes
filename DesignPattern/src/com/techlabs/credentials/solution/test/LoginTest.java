package com.techlabs.credentials.solution.test;

import com.techlabs.credentials.solution.model.Login;

public class LoginTest {

	    public static void main(String[] args) {
	        // Retrieve the singleton instance of the Login class
	        Login loginInstance = Login.getLogin();

	        // Print the message from the Login instance
	        System.out.println(loginInstance.getMessage());
	    }
	}


