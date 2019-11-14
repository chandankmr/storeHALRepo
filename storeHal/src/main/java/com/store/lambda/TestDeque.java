package com.store.lambda;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {
		Deque<String> queue= new ArrayDeque<>();
//		queue.add("one");
//		queue.add("two");
//		queue.add("three");
		queue.push("one");
		queue.push("two");
		queue.push("three");
		while(queue.size()>0) {
			System.out.println(queue.pop());
		}
		//queue.pop();
		//queue.pop();
//		for(String item:queue) {
//		System.out.println(item);	
//		}
	}

}
