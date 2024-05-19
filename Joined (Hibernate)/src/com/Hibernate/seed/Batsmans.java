package com.Hibernate.seed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn
public class Batsmans extends Players {

	@Column
	private int numRuns;

	
	public Batsmans(int payerId, String playerName, String country, int numMatches, int numRuns) {
		super(payerId, playerName, country, numMatches);
		this.numRuns = numRuns;
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
