package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;

import javax.persistence.Id;


//@Entity
public class Challenge implements Serializable{
/*
	private final static long serialVersionUID = 1L; 
	
	@Id
	@Column(name = "challengeID" , unique =  true)
	private int challengeID;
	
	@Column(name = "name" , unique =  true, nullable = false)
	private String name;
	
	@Column(name = "description", nullable = true)
	private String description;
	
	@Column(name = "maximumPlayers", nullable = false)
	private int maximumPlayers;	
	
	@Column(name = "displayInHomePage", nullable = true)
	private boolean displayInHomePage;
	
	@Column(name = "segments", nullable = true)
	private List<Integer> segments;	
	
	@Column(name = "administrators", nullable = true)
	private List<Integer> administrators;	
	
	@Column(name = "ended", nullable = true)
	private boolean ended;

	public Challenge() {}
	

	public Challenge(String name, String description, int maximumPlayers, List<Integer> segments) {
		this.name = name;
		this.description = description;
		this.maximumPlayers = maximumPlayers;
		this.segments = segments;
		this.displayInHomePage = false;
		this.administrators = new ArrayList<Integer>();
		this.ended = false;
	}

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

	public int getMaximumPlayers() {
		return maximumPlayers;
	}

	public void setMaximumPlayers(int maximumPlayers) {
		this.maximumPlayers = maximumPlayers;
	}

	public boolean isDisplayInHomePage() {
		return displayInHomePage;
	}

	public void setDisplayInHomePage(boolean displayInHomePage) {
		this.displayInHomePage = displayInHomePage;
	}

	public List<Integer> getSegments() {
		return segments;
	}

	public void setSegments(List<Integer> segments) {
		this.segments = segments;
	}

	public List<Integer> getAdministrators() {
		return administrators;
	}

	public void setAdministrators(List<Integer> administrators) {
		this.administrators = administrators;
	}

	public boolean isEnded() {
		return ended;
	}

	public void setEnded(boolean ended) {
		this.ended = ended;
	}
	
	public boolean addAdministrator(int adminID) {
		if (!this.administrators.contains(adminID)) {
			this.administrators.add(adminID);
			return true;
		}
		return false;
	}
	
	public boolean addSegment(int segmentID) {
		if (!this.administrators.contains(segmentID)) {
			this.administrators.add(segmentID);
			return true;
		}
		return false;
	}	
*/
}