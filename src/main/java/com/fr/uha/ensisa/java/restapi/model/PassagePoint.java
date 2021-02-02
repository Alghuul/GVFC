package com.fr.uha.ensisa.java.restapi.model;

import javax.persistence.Id;

public class PassagePoint {

	@Id
	private String challengeID;
	
	private int level;
	private String description;
	 
}
