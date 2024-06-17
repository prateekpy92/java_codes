package com.techlabs.test;

import com.techlabs.model.NewThread;

public class NewThreadDemo {

	 public static void main(String[] args) {
	        // Create and start threads with different priorities
	        NewThread thread1 = new NewThread("Thread-1", Thread.MIN_PRIORITY);
	        NewThread thread2 = new NewThread("Thread-2", Thread.NORM_PRIORITY);
	        NewThread thread3 = new NewThread("Thread-3", Thread.MAX_PRIORITY);
	    }
}
