package com.demo.thread;

public class InterruptDemo {
	public static void main(String[] args) {
		MyDemoThread demoThread=new MyDemoThread();
		try {
			Thread.sleep(1);
			
			demoThread.threadInstance.interrupt();
			
			Thread.sleep(5);
			
		} catch (InterruptedException e) {
			System.out.println("Caught :"+e);
		}
		
		System.out.println("Exiting the main thread");

	}

}

class MyDemoThread implements Runnable{
	
	Thread threadInstance;
	
	MyDemoThread(){
		threadInstance=new Thread(this);
		System.out.println("New thread : "+threadInstance);
		threadInstance.start();
	}
	

	@Override
	public void run() {
		System.out.println("Starting inside thread");
		
		while(!Thread.interrupted()) {
			System.out.println(threadInstance +" is running");
		}
		
		System.out.println(threadInstance +" has stopped.");
		
	}
	
}
