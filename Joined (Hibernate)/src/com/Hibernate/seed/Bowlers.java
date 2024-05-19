package com.Hibernate.seed;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

@Entity
@Table
@PrimaryKeyJoinColumn
public class Bowlers extends Players{

	@Column
	private int numWickets;

	public Bowlers(int payerId, String playerName, String country, int numMatches, int numWickets) {
		super(payerId, playerName, country, numMatches);
		this.numWickets = numWickets;
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
