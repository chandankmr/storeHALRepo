package com.design.observer;

public class Main {

	public static void main(String[] args) {
		CurrentScoreDisplay observer1=new CurrentScoreDisplay();
		AverageScoreDisplay observer2=new AverageScoreDisplay();
		
		CricketData data=new CricketData();
		data.registerObservers(observer1);
		data.registerObservers(observer2);
		data.datachanged();
		data.unRegisterObservers(observer2);
		data.datachanged();
	}

}
