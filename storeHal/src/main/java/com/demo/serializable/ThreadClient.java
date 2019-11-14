package com.demo.serializable;

public class ThreadClient  {
	public static void main(String[] args) {
		ThreadClient tc=new ThreadClient();
		
		JoinThread t1=tc.new JoinThread();
		JoinThread t2=tc.new JoinThread();
		JoinThread t3=tc.new JoinThread();
		
		
		t1.start();
		
		try {
			
			System.out.println("Current thread on client side :"+ Thread.currentThread().getName());
			
		t1.join();
		}catch(InterruptedException ex) {
			System.out.println("Interrupted Exception has been caught "+ex);
		}
		
		t2.start();
		
		
		try {
			
			System.out.println("Current thread on client side :"+ Thread.currentThread().getName());
			
			t2.join();
			}catch(InterruptedException ex) {
				System.out.println("Interrupted Exception has been caught "+ex);
			}
		
		t3.start();
		
		try {
			
			System.out.println("Current thread on client side :"+ Thread.currentThread().getName());
			
			t3.join();
			}catch(InterruptedException ex) {
				System.out.println("Interrupted Exception has been caught "+ex);
			}
	}
	
	
	
	class JoinThread extends Thread{	
		public void run() {
			for(int i=0;i<2;i++) {
				try{
					Thread.sleep(500);
				System.out.println("Thread Name :"+ Thread.currentThread().getName());
				}
				
				catch(InterruptedException e){
					System.out.println("Exception has been caught : "+e);
				}
				
				
				System.out.println("i="+i);
			}
		}
	}

}
