package com.techlabs.test;

import com.techlabs.model.NewThread;

public class jionTest {

	public static void main(String[] args) throws InterruptedException {
		NewThread thread1 = new NewThread("T1", 0);
		NewThread thread2 = new NewThread("T2", 0);
		NewThread thread3 = new NewThread("T3", 0);

		System.out.println(thread1.getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		System.out.println(thread3.getThread().isAlive());

		for (int i = 3; i > 0; i--) {
		    System.out.println(Thread.currentThread().getName() + ": " + i);
		    try {
		        Thread.sleep(100);
		    } catch (InterruptedException e) {
		        // TODO Auto-generated catch block
		        e.printStackTrace();
		    }
		}

		thread1.getThread().join();
		thread2.getThread().join();
		thread3.getThread().join();

		System.out.println(thread1.getThread().isAlive());
		System.out.println(thread2.getThread().isAlive());
		System.out.println(thread3.getThread().isAlive());

		System.out.println("Exiting main thread.");


	}

}
