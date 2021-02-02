package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;



@Entity
public class PassagePoint implements Serializable{


	private final static long SerialVersionUID = 1L;

	@Id
	@GeneratedValue (strategy = GenerationType.AUTO)
	@Column(name="passagepointID", unique = true)
	private int passagepointID;
	@Column(name = "challengeID", unique = true)
	private String challengeID;
	@Column(name = "level", nullable = false)
	private int level;
	@Column(name = "description" , nullable = false)
	private String description;
	 
	public PassagePoint(int passagepointID, String challengeID, int level, String description) {
		super();
		this.passagepointID = passagepointID;
		this.challengeID = challengeID;
		this.level = level;
		this.description = description;
	}
	
	public PassagePoint() {
		
	}

	public int getPassagepointID() {
		return passagepointID;
	}

	public void setPassagepointID(int passagepointID) {
		this.passagepointID = passagepointID;
	}

	public String getChallengeID() {
		return challengeID;
	}

	public void setChallengeID(String challengeID) {
		this.challengeID = challengeID;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
	
}
