package com.techlabs.test;


	import java.util.concurrent.Callable;

	public class Call implements Callable<Integer> {
	    @Override
	    public Integer call() throws Exception {
	        // Simulate some work with a sleep
	        Thread.sleep(1000);
	        // Return some result, for example, a random number
	        return (int) (Math.random() * 100);
	    }
	}


