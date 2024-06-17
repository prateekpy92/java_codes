package com.techlabs.model;

public class NewThread implements Runnable {
    private Thread thread;

    public NewThread(String name) {
    	super();
        this.thread = new Thread(this,name);
        thread.start();
        
    }

   

	public NewThread(Thread thread) {
		super();
		this.thread = thread;
	}



	@Override
    public void run() {
        for (int i = 3; i > 0; i--) {
            System.out.println(Thread.currentThread().getName() + " : " + i);

            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}