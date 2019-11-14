package com.demo.thread;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Immutable {
	private int id;
	private String name;
	private HashMap<String,String> testMap;
	
	
	
	
	public int getId() {
		return id;
	}




	public String getName() {
		return name;
	}




	public HashMap<String, String> getTestMap() {
		return (HashMap<String, String>)testMap.clone();
		//return testMap;
	}
	
	




	public Immutable(int id, String name, HashMap<String, String> testMap) {
		super();
		this.id = id;
		this.name = name;
		this.testMap = testMap;
	}




//	public Immutable(int id, String name, HashMap<String, String> testMap) {
//		System.out.println("Performing deep copy");
//		this.id = id;
//		this.name = name;
//		//this.testMap = testMap;
//		HashMap<String,String> tempMap=new HashMap<>();
//		
//		Iterator<String> iterator=testMap.keySet().iterator();
//		String key;
//		while(iterator.hasNext()) {
//			key=iterator.next();
//			tempMap.put(key, testMap.get(key));
//		}
//		
//		this.testMap = tempMap;
//	}




	public static void main(String[] args) {
		HashMap<String,String> map=new HashMap<>();
		map.put("1", "first");
		map.put("2", "second");
		String s="original";
		int i=10;
		Immutable obj=new Immutable(i,s,map);
		System.out.println(s==obj.getName());
		System.out.println(map==obj.getTestMap());
		
		System.out.println("Printing the obj values: ");
		
		System.out.println("obj id= "+ obj.getId());
		System.out.println("obj name = "+ obj.getName());
		System.out.println("obj TestMap= "+ obj.getTestMap());
		
		//change the local variable values
		i=20;
		s="modified";
		map.put("3", "third");
		
		obj=new Immutable(i,s,map);
		System.out.println("Printing the modified values: ");
		System.out.println("obj id= "+ obj.getId());
		System.out.println("obj name= "+ obj.getName());
		System.out.println("obj TestMap= "+ obj.getTestMap());
		
		HashMap<String,String> map1=obj.getTestMap();
		map1.put("4", "new");
		
		System.out.println("test map after changing variable from accessor methods :"+obj.getTestMap());
		
	}

}
