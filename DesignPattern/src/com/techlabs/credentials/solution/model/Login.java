package com.techlabs.credentials.solution.model;
public class Login {

	    private static Login login;
	    
	    private Login() {
	        // private constructor to prevent instantiation
	    }

	    public static Login getLogin() {
	        if (login == null) {
	          
	                    login = new Login(); // lazily
	                }
	          
	        return login;
	    }

	    public String getMessage() {
	        return "Login Successful";
	    }
	}
