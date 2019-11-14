package com.store.lambda;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CacheAny<T> {
	
	private T t;
	
	

	public T getT() {
		return t;
	}



	public void setT(T t) {
		this.t = t;
	}



	public static void main(String[] args) {
		CacheAny<String>  t = new CacheAny<> ();
		
		t.setT("Hello");
	System.out.println(t.getT());
	
	List partList=new ArrayList(2);
	partList.add(new Integer(3));
	partList.add("OOPS!");
	Iterator it=partList.iterator();
	while(it.hasNext()) {
		Integer partNum=(Integer)it.next();
		int partNo=partNum.intValue();
	}

	}

}
