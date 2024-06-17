package com.techlabs.test;

import com.techlabs.model.MyThread;

public class ThreadDemotest {

	public static void main(String[] args) {
		  MyThread thread1 = new MyThread("Thread-1");
	        MyThread thread2 = new MyThread("Thread-2");
	        MyThread thread3 = new MyThread("Thread-3");
	    }
	
	  public void run() {
	        for (int i = 5; i > 0; i--) {
	            System.out.println(Thread.currentThread().getName() + " : " + i);

	            try {
	                Thread.sleep(1000);
	            } catch (InterruptedException e) {
	               
	                e.printStackTrace();
	            }
	}
	  }
	  }

