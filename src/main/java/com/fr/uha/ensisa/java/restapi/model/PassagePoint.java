package com.fr.uha.ensisa.java.restapi.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PassagePoint {

	@Id
	private String challengeID;
	
	private int level;
	private String description;
	 
}
