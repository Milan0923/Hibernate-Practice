package com.Hibernate.seed;

import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="emptype",discriminatorType=DiscriminatorType.STRING,length=20)
public class Player {
	
	@Id
	@Column
	private int payerId;
	@Column
	private String playerName;
	@Column
	private String country;
	@Column
	private int numMatches;
	
	public Player() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Player(int payerId, String playerName, String country, int numMatches) {
		super();
		this.payerId = payerId;
		this.playerName = playerName;
		this.country = country;
		this.numMatches = numMatches;
	}
	
	
	public int getPayerId() {
		return payerId;
	}


	public void setPayerId(int payerId) {
		this.payerId = payerId;
	}


	public String getPlayerName() {
		return playerName;
	}


	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}


	public String getCountry() {
		return country;
	}


	public void setCountry(String country) {
		this.country = country;
	}


	public int getNumMatches() {
		return numMatches;
	}


	public void setNumMatches(int numMatches) {
		this.numMatches = numMatches;
	}


	@Override
	public String toString() {
		return "Player [payerId=" + payerId + ", playerName=" + playerName + ", country=" + country + ", numMatches="
				+ numMatches + "]";
	}
	
}
