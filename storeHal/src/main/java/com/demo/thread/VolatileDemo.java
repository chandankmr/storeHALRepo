package com.demo.thread;

public class VolatileDemo{
private static volatile boolean exit;

public static void main(String[] args) {
	
	System.out.println("Started main thread");
	
	new Thread() {
		@Override
		public void run() {
			System.out.println("Started inside thread");
			while(!exit) {
				System.out.println("Running infinitely..");
			}
			
			System.out.println("exiting inside thread");
			
		}
	}.start();
	
	try {
		Thread.sleep(500);
	} catch (InterruptedException e) {
		System.out.println("Caught : "+e);
	}
	
	// so that we can stop the threads
	exit=true;
	System.out.println("exiting main thread");
}


}
