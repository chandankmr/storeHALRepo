package com.demo.thread;

public class YeildDemo {

	public static void main(String[] args) {
		MyYieldThread t=new MyYieldThread("Child thread");
		
		t.start();
		System.out.println("Main thread running...");
		Thread.yield();
		System.out.println("Main thread exited");

	}

}

class MyYieldThread extends Thread{
	private String name;
	
	MyYieldThread(String name){
		this.name=name;
	}
	public void run() {
		for(int i=0;i<5;i++) {
			System.out.println("Thread running : "+Thread.currentThread().getName());
		}
	}
}


