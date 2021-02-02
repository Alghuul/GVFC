package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;


import javax.persistence.Column;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;



@Entity
@Table(name = "passagepoint")
public class PassagePoint implements Serializable{


	/**
	 * 
	 */
	private static final long serialVersionUID = 7714770575023878228L;



	@Id
	@Column(name="passagepointID", unique = true)
	private int passagepointID;
	@Column(name = "challengeID", unique = true)
	private int challengeID;
	@Column(name = "level", nullable = false)
	private int level;
	@Column(name = "description" , nullable = false)
	private String description;
	 
	public PassagePoint( int challengeID, int level, String description) {
		
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

	public int getChallengeID() {
		return challengeID;
	}

	public void setChallengeID(int challengeID) {
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