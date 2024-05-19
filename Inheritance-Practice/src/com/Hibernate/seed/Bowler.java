package com.Hibernate.seed;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value="bowlplr")
public class Bowler extends Player {

	@Column
	private int numWickets;

	public Bowler(int i, String string, String string2, int j, int k) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Bowler(int payerId, String playerName, String country, int numMatches) {
		super(payerId, playerName, country, numMatches);
		// TODO Auto-generated constructor stub
	}

	public int getNumWickets() {
		return numWickets;
	}

	public void setNumWickets(int numWickets) {
		this.numWickets = numWickets;
	}

	@Override
	public String toString() {
		return "Bowler [numWickets=" + numWickets + "]";
	}
	
	
}
