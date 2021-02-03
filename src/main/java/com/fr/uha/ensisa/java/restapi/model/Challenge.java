package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name ="challenge")
public class Challenge implements Serializable{

	private final static long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "challengeID" , unique =  true)
	private int challengeID;
	
	@Column(name = "name" , unique =  true, nullable = false)
	private String name;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "maxplayer", nullable = false)
	private int maxplayer;	
	
	@Column(name = "display", nullable = true)
	private int display;
	
	@Column(name = "segmentID", nullable = true)
	private int segmentID;	
	
	@Column(name = "adminID", nullable = true)
	private int adminID;	
	
	
	@Column(name = "ended", nullable = true)
	private int ended;

	public Challenge() {}

	public int getChallengeID() {
		return challengeID;
	}

	public void setChallengeID(int challengeID) {
		this.challengeID = challengeID;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getMaxplayer() {
		return maxplayer;
	}

	public void setMaxplayer(int maxplayer) {
		this.maxplayer = maxplayer;
	}

	public int getDisplay() {
		return display;
	}

	public void setDisplay(int display) {
		this.display = display;
	}

	public int getSegmentID() {
		return segmentID;
	}

	public void setSegmentID(int segmentID) {
		this.segmentID = segmentID;
	}

	public int getAdminID() {
		return adminID;
	}

	public void setAdminID(int adminID) {
		this.adminID = adminID;
	}

	public int getEnded() {
		return ended;
	}

	public void setEnded(int ended) {
		this.ended = ended;
	}
	

	
}