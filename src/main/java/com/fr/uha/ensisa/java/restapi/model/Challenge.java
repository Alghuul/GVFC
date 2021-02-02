package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;


@Entity
public class Challenge implements Serializable{

	private final static long serialVersionUID = 1L; 
	@Id
	private String challengeID;
	private String name;
	private String description;
	
	//private Boolean isSoloChallenge; ??
	private int maximumPlayers;
	
	
	
	private boolean displayInHomePage;
	private List<Segment> segments;
	
	
	
	private List<User> administrators;
	
	private boolean ended;

	public Challenge() {
	}
	
	
	
	

}
