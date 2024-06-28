package com.techlabs.model;

public class NewThread implements Runnable {
    private Thread thread;

    public NewThread(String name, int minPriority) {
    	super();
        this.setThread(new Thread(this,name));
        getThread().start();
        
    }

   

	public NewThread(Thread thread) {
		super();
		this.setThread(thread);
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



	public Thread getThread() {
		return thread;
	}



	public void setThread(Thread thread) {
		this.thread = thread;
	}
}