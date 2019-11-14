package com.design.observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CricketData implements Subject{
	
	private List<Observer> observers;
	private int runs;
	private int wickets;
	private float overs;
	


	public int getLatestRuns() {
		return 90;
	}

	public int getLatestWickets() {
		return 3;
	}

	public float getLatestOvers() {
		return (float) 10.2;
	}

	CricketData(){
		observers=new ArrayList<>();	
	}

	@Override
	public void registerObservers(Observer observer) {
		observers.add(observer);
		
	}

	@Override
	public void unRegisterObservers(Observer observer) {
		observers.remove(observers.indexOf(observer));
		
	}
	
	public void datachanged() {
		this.runs=getLatestRuns();
		this.wickets=getLatestWickets();
		this.overs=getLatestOvers();
		notifyObservers();
	}

	@Override
	public void notifyObservers() {
		for(Iterator<Observer> iter=observers.iterator();iter.hasNext();) {
			Observer observer=iter.next();
			observer.update(runs, wickets, overs);
		}
		
	}
	
	
	

}
