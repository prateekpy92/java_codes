package com.techlabs.solution.test;

import com.techlabs.solution.model.Context;
import com.techlabs.solution.model.StartState;
import com.techlabs.solution.model.StopState;


public class Demo {
	 public static void main(String[] args) {
	      Context context = new Context();

	      StartState startState = new StartState();
	      startState.doAction(context);

	      System.out.println(context.getState().toString());

	      StopState stopState = new StopState();
	      stopState.doAction(context);

	      System.out.println(context.getState().toString());
	   }
	}


