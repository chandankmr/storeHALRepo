package com.demo.thread;

public class VariablekillDemo {
	
	public static void main(String[] args) {
		MyThread t1=new MyThread("First Thread");
		MyThread t2=new MyThread("First Thread");
		
		try {
			Thread.sleep(500);
			t1.stop();
			t2.stop();
			Thread.sleep(500);
		} catch (InterruptedException e) {
			System.out.println("Caught : "+e);
		}
		
		System.out.println("Exiting the main thread");
	}

}

class MyThread implements Runnable{
	
	private boolean exit;
	private String name;
	Thread t;
	
	MyThread(String name){
		this.name=name;
		t=new Thread(this,name);
		System.out.println("new Thread : "+t);
		exit=false;
		t.start();
		
	}

	@Override
	public void run() {
		
		while(!exit) {
			int i=0;
			System.out.println(name+" : "+i);
			i++;
			
			try {
				Thread.sleep(100);
				
			}catch(InterruptedException e) {
				System.out.println("Caught : "+e);
			}
		}
		
		System.out.println(name+" : stopped");
		
	}
	// for stopping the thread
	public void stop() {
		exit=true;
	}
	
}