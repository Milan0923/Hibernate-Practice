package com.Hibernate.seed;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;

@DiscriminatorValue(value="batplr")
public class Batsman extends Player {

	@Column
	private int numRuns;

	public Batsman(int i, String string, String string2, String string3, int j) {
		super();
		// TODO Auto-generated constructor stub
	}

	public Batsman(int payerId, String playerName, String country, int numMatches) {
		super(payerId, playerName, country, numMatches);
		// TODO Auto-generated constructor stub
	}

	public int getNumRuns() {
		return numRuns;
	}

	public void setNumRuns(int numRuns) {
		this.numRuns = numRuns;
	}

	@Override
	public String toString() {
		return "Batsman [numRuns=" + numRuns + "]";
	}
	
	
}
