package com.design.observer;

public class CurrentScoreDisplay implements Observer {
	private int runs;
	private int wickets;
	private float overs;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs=runs;
		this.wickets=wickets;
		this.overs=overs;
		display();
	}

	public void display() {
		System.out.println("Current Score: "
				+"\nRuns: "+runs
				+"\nWickets: "+wickets
				+"\novers: "+overs
				);
		
	}

	
	
}
