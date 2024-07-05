package com.techlabs.solution.model;

public class StopState implements State {

	   public void doAction(Context context) {
	      System.out.println("Player is in stop state");
	      context.setState(this);	
	   }

	   public String toString(){
	      return "Stop State";
	   }
	}
