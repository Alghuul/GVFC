package com.fr.uha.ensisa.java.restapi.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.*;


@Entity
public class Suggestion {

	
	@Id
	private int id;
	
	private String userID;
	
	private List<Integer> voters;
	private String theme;
	
	private Boolean isValidated;
	
	//user votefor suggestion = voteFor ++ 

	//deletevote
}
