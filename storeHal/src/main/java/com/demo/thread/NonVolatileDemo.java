package com.demo.thread;

public class NonVolatileDemo { //But this program is terminating without errors
	
	static boolean exit=false;
	
public static void main(String[] args) {
	
	System.out.println("Started main thread..");

	new Thread() {
	public void run() {
		System.out.println("Started inside thread..");
		
		while(!exit) { // will run infinitely
			System.out.println("Running infinitely..");
		}
		
		System.out.println("Exiting inside thread..");
	}
	}.start();
	
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		System.out.println("Caught :"+e);
	}
	
	//so that we can stop the threads
	exit=true;
	System.out.println("Exiting main thread");
}
}
