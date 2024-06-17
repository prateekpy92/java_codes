package com.techlabs.test;

public class ThreadTest {

	public static void main(String[] args) {
		
		System.out.println(Thread.currentThread());

		Thread thread = Thread.currentThread();
		thread.setName("MainThread");

		System.out.println(thread);

		for (int i = 10; i >= 1; i--) {
		    System.out.println(thread.getName() + " : " + i);
		    try {
		        Thread.sleep(2000);
		    } catch (InterruptedException e) {
		      
		        e.printStackTrace();
		    }
		}

	}

}
