package com.fr.uha.ensisa.java.restapi.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Id;



@Entity
public class PassagePoint implements Serializable{

	private final static long SerialVersionUID = 1L;
	
	@Id
	private String challengeID;
	
	private int level;
	private String description;
	 
}
