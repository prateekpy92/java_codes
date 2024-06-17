package com.techlabs.test;


import com.techlabs.model.AgeNotValidException;
import com.techlabs.model.Voter;
public class VoterTest {
	


	  public static void main(String[] args) {

	    try {
	      Voter voter1 = new Voter("Praveen", 30);
	      voter1.vote();

	      Voter voter2 = new Voter("Prateek", 17);
	      voter2.vote();

	    } catch (AgeNotValidException e) {
	      System.out.println(e.getMessage());
	    }
	  }
	}

