package com.demo.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorDemo {
	
	static final int MAX_T=3; 

	public static void main(String[] args) {
		Runnable r1=new MyRunnable("Task 1");
		
		Runnable r2=new MyRunnable("Task 2");
		
		Runnable r3=new MyRunnable("Task 3");
//		
		Runnable r4=new MyRunnable("Task 4");
		
		ExecutorService pool= Executors.newFixedThreadPool(MAX_T);
		//ExecutorService pool= Executors.newCachedThreadPool();
		//ExecutorService pool= Executors.newSingleThreadExecutor();
	
		pool.execute(r1);
		pool.execute(r2);
		pool.execute(r3);
		pool.execute(r4);
		
		pool.shutdown();

	}

}

class MyRunnable implements Runnable{
	
	String name;
	
	MyRunnable(String name){
		this.name=name;
	}	

	@Override
	public void run() {
		for(int i=0;i<3;i++) {
			System.out.println("Taskname :"+name+" for i="+i);
		}
		
		System.out.println("Taskname : "+name+" completed");
		
	}
	
}
